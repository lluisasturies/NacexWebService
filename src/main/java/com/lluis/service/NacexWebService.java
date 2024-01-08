package com.lluis.service;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import com.lluis.dto.Expedicion;
import com.lluis.utilidades.AgenciaJSONFormat;
import com.lluis.utilidades.EnvioJSONFormat;
import com.lluis.utilidades.EstadoExpedicionJSONFormat;

import static java.util.stream.Collectors.joining;

public class NacexWebService {
	
	private String url= "http://pda.nacex.com/nacex_ws/ws";
	private String usuario;
	private String pass;

	public NacexWebService(String usuario, String pass) {
		this.usuario = usuario;
		try {
			MessageDigest m = MessageDigest.getInstance("MD5");
	        m.update(pass.getBytes(),0,pass.length());
	 
	        this.pass = new BigInteger(1,m.digest()).toString(16);
	        
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			
		}
		
	}
	
	private String call(String metodo, Map<String, String> data) {
		String dataString = data.entrySet().stream().map(e -> e.getKey()+"="+e.getValue()).collect(joining("|"));
		dataString = URLEncoder.encode(dataString, StandardCharsets.UTF_8);
		
		String fullUrl = this.url + "?method=" + URLEncoder.encode(metodo, StandardCharsets.UTF_8) + "&data=" + dataString + "&user=" + this.usuario + "&pass=" + this.pass;
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(fullUrl)).build();

		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			return response.body();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	/**
	 * Suministra los datos de información de una Expedición o Recogida mediante el Código de Expedición.
	 * @param codExp  Código único de la expedición o de la recogida
	 * @param tipo Constante "E" o "R" para indicar si se trata de una expedición "E" o una recogida "R"
	 * @return
	 */
	public String getInfoEnvio(String codExp, String tipo) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("codigo", codExp);
		data.put("tipo", tipo);

		return new EnvioJSONFormat().formatea(this.call("getInfoEnvio", data));
	}
	
	/**
	 * Suministra los datos de información de una Expedición o Recogida mediante un Albarán.
	 * @param albaran  Agencia de origen / Albarán
	 * @param tipo Constante "E" o "R" para indicar si se trata de una expedición "E" o una recogida "R"
	 * @return
	 */
	public String getInfoEnvioPorAlbaran(String albaran, String tipo) {
		String[] aux = albaran.split("/");
		
		Map<String, String> data = new HashMap<String, String>();
		data.put("del", aux[0]);
		data.put("num", aux[1]);
		data.put("tipo", tipo);
		
		return new EnvioJSONFormat().formatea(this.call("getInfoEnvio", data));
	}
	
	/**
	 * Suministra los datos de información de una Expedición
	 * @param codExp Código único de la expedición
	 * @return
	 */
	public String getEstadoExpedicion(String codExp) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("expe_codigo", codExp);
		
		return new EstadoExpedicionJSONFormat().formatea(this.call("getEstadoExpedicion", data));
	}
	
	/**
	 * Códigos de escape para enviar a la impresora o representación decodificada en Base64URL de imagénes PNG o PDF de 14,85 cm de ancho por 10,5 cm de alto.
	 * @param codExp Código de expedición
	 * @param modelo Modelo de etiquetadora. Puede ser: TECSV4_B, TECEV4_B, TECFV4_B, ZEBRA_B, IMAGEN_B o PDF_B
	 * @return
	 */
	public String getEtiqueta(String codExp, String modelo) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("codExp", codExp);
		data.put("modelo", modelo);
		
		return this.call("getEtiqueta", data);
	}
	
	/**
	 * Suministra los datos de la agencia asociada a un código postal.
	 * @param cp Código Postal
	 * @return
	 */
	public String getAgencia(String cp) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("cp", cp);
		
		return new AgenciaJSONFormat().formatea(this.call("getAgencia", data));
	}
	
	/**
	 * Da de alta una nueva expedición en el sistema.
	 * @param expedicion
	 * @return
	 */
	public String putExpedicion(Expedicion expedicion) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("del_cli", expedicion.getDel_cli());
		data.put("num_cli", expedicion.getNum_cli());
		data.put("dep_cli", expedicion.getDep_cli());
		data.put("fec", expedicion.getFec());
		data.put("tip_ser", expedicion.getTip_ser());
		data.put("tip_cob", expedicion.getTip_cob());
		data.put("exc", expedicion.getExc());
		data.put("ref_cli", expedicion.getRef_cli());
		data.put("tip_env", expedicion.getTip_env());
		data.put("bul", expedicion.getBul());
		data.put("kil", expedicion.getKil());
		data.put("nom_rec", expedicion.getNom_rec());
		data.put("dir_rec", expedicion.getDir_rec());
		data.put("cp_rec", expedicion.getCp_rec());
		data.put("pais_rec", expedicion.getPais_rec());
		data.put("pob_rec", expedicion.getPob_rec());
		data.put("tel_rec", expedicion.getTel_rec());
		data.put("nom_ent", expedicion.getNom_ent());
		data.put("per_ent", expedicion.getPer_ent());
		data.put("dir_ent", expedicion.getDir_ent());
		data.put("pais_ent", expedicion.getPais_ent());
		data.put("cp_ent", expedicion.getCp_ent());
		data.put("pob_ent", expedicion.getPob_ent());
		data.put("tel_ent", expedicion.getTel_ent());
		data.put("ree", expedicion.getRee());
		data.put("tip_ree", expedicion.getTip_ree());
		if (expedicion.getObs() != null) {
			for (int i = 0; i <= expedicion.getObs().size(); i++) {
				data.put("obs" + i+1, expedicion.getObs().get(i));
			}
		}
		data.put("ret", expedicion.getRet());
		data.put("ges", expedicion.getGes());
		data.put("ok15", expedicion.getOk15());
		data.put("tip_seg", expedicion.getTip_seg());
		data.put("seg", expedicion.getSeg());
		data.put("tip_ea", expedicion.getTip_ea());
		data.put("ealerta", expedicion.getEalerta());
		data.put("alto", expedicion.getAlto());
		data.put("ancho", expedicion.getAncho());
		data.put("largo", expedicion.getLargo());
		data.put("con", expedicion.getCon());
		data.put("val_dec", expedicion.getVal_dec());
		data.put("dig", expedicion.getDig());
		data.put("num_dig", expedicion.getNum_dig());
		if (expedicion.getIns_adi_lista() != null) {
			for (int i = 0; i <= expedicion.getIns_adi_lista().size(); i++) {
				data.put("ins_adi" + i, expedicion.getIns_adi_lista().get(i));
			}
		}
		if (expedicion.getTip_pre() != null) {
		for (int i = 0; i <= expedicion.getTip_pre().size(); i++) {
			data.put("tip_pre" + i+1, expedicion.getTip_pre().get(i));
		}
		}
		if (expedicion.getMod_pre() != null) {
		for (int i = 0; i <= expedicion.getMod_pre().size(); i++) {
			data.put("mod_pre" + i+1, expedicion.getMod_pre().get(i));
		}
		}
		if (expedicion.getPre() != null) {
		for (int i = 0; i <= expedicion.getPre().size(); i++) {
			data.put("pre" + i+1, expedicion.getPre().get(i));
		}
		}
		if (expedicion.getMsg() != null) {
		for (int i = 0; i <= expedicion.getMsg().size(); i++) {
			data.put("msg" + i+1, expedicion.getMsg().get(i));
		}
		}
		data.put("ins_adi", expedicion.getIns_adi());
		data.put("cam_serv", expedicion.getCam_serv());
		data.put("shop_codigo", expedicion.getShop_codigo());
		data.put("frec_codigo", expedicion.getFrec_codigo());
		data.put("lat_rec", expedicion.getLat_rec());
		data.put("lat_ent", expedicion.getLat_ent());
		data.put("lng_ent", expedicion.getLng_ent());
		
		return this.call("putExpedicion", data);
	}
	
	/**
	 * Cancela una expedición en el sistema mediante el código de Expedición
	 * @param codExp Código de expedición
	 * @return
	 */
	public String cancelExpedicion(String codExp) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("expe_codigo", codExp);
		
		return this.call("cancelExpedicion", data);
	}
	
	/**
	 * Cancela una expedición en el sistema mediante el Albarán
	 * @param albaran Agencia de origen / Albarán
	 * @return
	 */
	public String cancelExpedicionPorAlbaran(String albaran) {
		String[] aux = albaran.split("/");
		
		Map<String, String> data = new HashMap<String, String>();
		data.put("origen", aux[0]);
		data.put("num", aux[1]);
		
		return this.call("cancelExpedicion", data);
	}

}
