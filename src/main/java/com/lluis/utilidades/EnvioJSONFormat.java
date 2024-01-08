package com.lluis.utilidades;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.lluis.dto.Observacion;

public class EnvioJSONFormat {
	public String formatea(String data) {
		
		String[] resultado = data.split("\\|");
		String[] estados = data.substring(data.indexOf("historico_estados")+18).split("\\|");
		List<Observacion> observaciones = new ArrayList<Observacion>();
		
		for (int i = 0 ; i < estados.length; i++) {
			Observacion observacion = new Observacion();
			
			String[] datosObservacion = estados[i].split("~");
			
			observacion.setFecha(datosObservacion[0]);
			observacion.setCodEstado(datosObservacion[1]);
			observacion.setEstado(datosObservacion[2]);
			observacion.setWeb(datosObservacion[3]);
			observacion.setCod1(datosObservacion[4]);
			observacion.setCod2(datosObservacion[5]);
			observacion.setCod3(datosObservacion[6]);
				
			observaciones.add(observacion);
		}
		
		JSONObject jsonObject = new JSONObject();
		
        jsonObject.put("codExp", resultado[0]);
        jsonObject.put("delOrigen", resultado[1]);
        jsonObject.put("albaran", resultado[2]);
        jsonObject.put("delCliente", resultado[3]);
        jsonObject.put("codCliente", resultado[4]);
        jsonObject.put("depCliente", resultado[5]);
        jsonObject.put("fechaExp", resultado[6]);
        jsonObject.put("codServicio", resultado[7]);
        jsonObject.put("descServicio", resultado[8]);
        jsonObject.put("codEnvase", resultado[9]);
        jsonObject.put("descEnvase", resultado[10]);
        jsonObject.put("bultos", resultado[11]);
        jsonObject.put("kilos", resultado[12]);
        jsonObject.put("excesos", resultado[13]);
        jsonObject.put("refCliente", resultado[14]);
        jsonObject.put("tipoCobro", resultado[15]);
        jsonObject.put("nomRecogida", resultado[16]);
        jsonObject.put("dirRecogida", resultado[17]);
        jsonObject.put("cpRecogida", resultado[18]);
        jsonObject.put("pobRecogida", resultado[19]);
        jsonObject.put("provRecogida", resultado[20]);
        jsonObject.put("contRecogida", resultado[21]);
        jsonObject.put("telRecogida", resultado[22]);
        jsonObject.put("codDelRecogida", resultado[23]);
        jsonObject.put("telDelRecogida", resultado[24]);
        jsonObject.put("nombreEntrega", resultado[25]);
        jsonObject.put("dirEntrega", resultado[26]);
        jsonObject.put("cpEntrega", resultado[27]);
        jsonObject.put("pobEntrega", resultado[28]);
        jsonObject.put("provEntrega", resultado[29]);
        jsonObject.put("contEntrega", resultado[30]);
        jsonObject.put("telEntrega", resultado[31]);
        jsonObject.put("codDelEntrega", resultado[32]);
        jsonObject.put("telDelEntrega", resultado[33]);
        jsonObject.put("observaciones", resultado[34]);
        jsonObject.put("aduana", resultado[35]);
        jsonObject.put("confOk15m", resultado[36]);
        jsonObject.put("ret", resultado[37]);
        jsonObject.put("gestion", resultado[38]);
        jsonObject.put("ealerta", resultado[39]);
        jsonObject.put("tipea", resultado[40]);
        jsonObject.put("observaciones", observaciones);
        
		String jsonString = jsonObject.toString();
		
		return jsonString;
	}
}
