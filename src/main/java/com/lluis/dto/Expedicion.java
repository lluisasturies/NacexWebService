package com.lluis.dto;

import java.util.List;

public class Expedicion {
	private String del_cli;
	private String num_cli;
	private String dep_cli;
	private String fec;
	private String tip_ser;
	private String tip_cob;
	private String exc;
	private String ref_cli;
	private String tip_env;
	private String bul;
	private String kil;
	private String nom_rec;
	private String dir_rec;
	private String cp_rec;
	private String pais_rec;
	private String pob_rec;
	private String tel_rec;
	private String nom_ent;
	private String per_ent;
	private String dir_ent;
	private String pais_ent;
	private String cp_ent;
	private String pob_ent;
	private String tel_ent;
	private String ree;
	private String tip_ree;
	private List<String> obs;
	private String ret;
	private String ges;
	private String ok15;
	private String tip_seg;
	private String seg;
	private String tip_ea;
	private String ealerta;
	private String alto;
	private String ancho;
	private String largo;
	private String con;
	private String val_dec;
	private String dig;
	private String num_dig;
	private List<String> ins_adi_lista;
	private List<String> tip_pre;
	private List<String> mod_pre;
	private List<String> pre;
	private List<String> msg;
	private String ins_adi;
	private String cam_serv;
	private String shop_codigo;
	private String frec_codigo;
	private String lat_rec;
	private String lng_rec;
	private String lat_ent;
	private String lng_ent;
	
	public Expedicion(String del_cli, String num_cli, String dep_cli, String fec, 
			String tip_ser, String tip_cob, String exc, String ref_cli, String tip_env, String bul, String kil, String nom_rec,
			String dir_rec, String cp_rec, String pais_rec, String pob_rec, String tel_rec, String nom_ent, String per_ent,
			String dir_ent, String pais_ent, String cp_ent, String pob_ent, String tel_ent, String ree, String tip_ree, List<String> obs, 
			String ret, String ges, String ok15, String tip_seg, String seg, String tip_ea, String ealerta, String alto, String ancho, 
			String largo, String con, String val_dec, String dig, String num_dig, List<String> ins_adi_lista, List<String> tip_pre, 
			List<String> mod_pre, List<String> pre, List<String> msg, String ins_adi, String cam_serv, String shop_codigo, String frec_codigo, 
			String lat_rec, String lng_rec, String lat_ent, String lng_ent) {
		this.del_cli = del_cli;
		this.num_cli = num_cli;
		this.dep_cli = dep_cli;
		this.fec = fec;
		this.tip_ser = tip_ser;
		this.tip_cob = tip_cob;
		this.exc = exc;
		this.ref_cli = ref_cli;
		this.tip_env = tip_env;
		this.bul = bul;
		this.kil = kil;
		this.nom_rec = nom_rec;
		this.dir_rec = dir_rec;
		this.cp_rec = cp_rec;
		this.pais_rec = pais_rec;
		this.pob_rec = pob_rec;
		this.tel_rec = tel_rec;
		this.nom_ent = nom_ent;
		this.per_ent = per_ent;
		this.dir_ent = dir_ent;
		this.pais_ent = pais_ent;
		this.cp_ent = cp_ent;
		this.pob_ent = pob_ent;
		this.tel_ent = tel_ent;
		this.ree = ree;
		this.tip_ree = tip_ree;
		this.obs = obs;
		this.ret = ret;
		this.ges = ges;
		this.ok15 = ok15;
		this.tip_seg = tip_seg;
		this.seg = seg;
		this.tip_ea = tip_ea;
		this.ealerta = ealerta;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.con = con;
		this.val_dec = val_dec;
		this.dig = dig;
		this.num_dig = num_dig;
		this.ins_adi_lista = ins_adi_lista;
		this.tip_pre = tip_pre;
		this.mod_pre = mod_pre;
		this.pre = pre;
		this.msg = msg;
		this.ins_adi = ins_adi;
		this.cam_serv = cam_serv;
		this.shop_codigo = shop_codigo;
		this.frec_codigo = frec_codigo;
		this.lat_rec = lat_rec;
		this.lng_rec = lng_rec;
		this.lat_ent = lat_ent;
		this.lng_ent = lng_ent;
		
	}

	public String getDel_cli() {
		return del_cli;
	}

	public void setDel_cli(String del_cli) {
		this.del_cli = del_cli;
	}

	public String getNum_cli() {
		return num_cli;
	}

	public void setNum_cli(String num_cli) {
		this.num_cli = num_cli;
	}

	public String getDep_cli() {
		return dep_cli;
	}

	public void setDep_cli(String dep_cli) {
		this.dep_cli = dep_cli;
	}

	public String getFec() {
		return fec;
	}

	public void setFec(String fec) {
		this.fec = fec;
	}

	public String getTip_ser() {
		return tip_ser;
	}

	public void setTip_ser(String tip_ser) {
		this.tip_ser = tip_ser;
	}

	public String getTip_cob() {
		return tip_cob;
	}

	public void setTip_cob(String tip_cob) {
		this.tip_cob = tip_cob;
	}

	public String getExc() {
		return exc;
	}

	public void setExc(String exc) {
		this.exc = exc;
	}

	public String getRef_cli() {
		return ref_cli;
	}

	public void setRef_cli(String ref_cli) {
		this.ref_cli = ref_cli;
	}

	public String getTip_env() {
		return tip_env;
	}

	public void setTip_env(String tip_env) {
		this.tip_env = tip_env;
	}

	public String getBul() {
		return bul;
	}

	public void setBul(String bul) {
		this.bul = bul;
	}

	public String getKil() {
		return kil;
	}

	public void setKil(String kil) {
		this.kil = kil;
	}

	public String getNom_rec() {
		return nom_rec;
	}

	public void setNom_rec(String nom_rec) {
		this.nom_rec = nom_rec;
	}

	public String getDir_rec() {
		return dir_rec;
	}

	public void setDir_rec(String dir_rec) {
		this.dir_rec = dir_rec;
	}

	public String getCp_rec() {
		return cp_rec;
	}

	public void setCp_rec(String cp_rec) {
		this.cp_rec = cp_rec;
	}

	public String getPais_rec() {
		return pais_rec;
	}

	public void setPais_rec(String pais_rec) {
		this.pais_rec = pais_rec;
	}

	public String getPob_rec() {
		return pob_rec;
	}

	public void setPob_rec(String pob_rec) {
		this.pob_rec = pob_rec;
	}

	public String getTel_rec() {
		return tel_rec;
	}

	public void setTel_rec(String tel_rec) {
		this.tel_rec = tel_rec;
	}

	public String getNom_ent() {
		return nom_ent;
	}

	public void setNom_ent(String nom_ent) {
		this.nom_ent = nom_ent;
	}

	public String getPer_ent() {
		return per_ent;
	}

	public void setPer_ent(String per_ent) {
		this.per_ent = per_ent;
	}

	public String getDir_ent() {
		return dir_ent;
	}

	public void setDir_ent(String dir_ent) {
		this.dir_ent = dir_ent;
	}

	public String getPais_ent() {
		return pais_ent;
	}

	public void setPais_ent(String pais_ent) {
		this.pais_ent = pais_ent;
	}

	public String getCp_ent() {
		return cp_ent;
	}

	public void setCp_ent(String cp_ent) {
		this.cp_ent = cp_ent;
	}

	public String getPob_ent() {
		return pob_ent;
	}

	public void setPob_ent(String pob_ent) {
		this.pob_ent = pob_ent;
	}

	public String getTel_ent() {
		return tel_ent;
	}

	public void setTel_ent(String tel_ent) {
		this.tel_ent = tel_ent;
	}

	public String getRee() {
		return ree;
	}

	public void setRee(String ree) {
		this.ree = ree;
	}

	public String getTip_ree() {
		return tip_ree;
	}

	public void setTip_ree(String tip_ree) {
		this.tip_ree = tip_ree;
	}

	public List<String> getObs() {
		return obs;
	}

	public void setObs(List<String> obs) {
		this.obs = obs;
	}

	public String getRet() {
		return ret;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}

	public String getGes() {
		return ges;
	}

	public void setGes(String ges) {
		this.ges = ges;
	}

	public String getOk15() {
		return ok15;
	}

	public void setOk15(String ok15) {
		this.ok15 = ok15;
	}

	public String getTip_seg() {
		return tip_seg;
	}

	public void setTip_seg(String tip_seg) {
		this.tip_seg = tip_seg;
	}

	public String getSeg() {
		return seg;
	}

	public void setSeg(String seg) {
		this.seg = seg;
	}

	public String getTip_ea() {
		return tip_ea;
	}

	public void setTip_ea(String tip_ea) {
		this.tip_ea = tip_ea;
	}

	public String getEalerta() {
		return ealerta;
	}

	public void setEalerta(String ealerta) {
		this.ealerta = ealerta;
	}

	public String getAlto() {
		return alto;
	}

	public void setAlto(String alto) {
		this.alto = alto;
	}

	public String getAncho() {
		return ancho;
	}

	public void setAncho(String ancho) {
		this.ancho = ancho;
	}

	public String getLargo() {
		return largo;
	}

	public void setLargo(String largo) {
		this.largo = largo;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public String getVal_dec() {
		return val_dec;
	}

	public void setVal_dec(String val_dec) {
		this.val_dec = val_dec;
	}

	public String getDig() {
		return dig;
	}

	public void setDig(String dig) {
		this.dig = dig;
	}

	public String getNum_dig() {
		return num_dig;
	}

	public void setNum_dig(String num_dig) {
		this.num_dig = num_dig;
	}

	public List<String> getIns_adi_lista() {
		return ins_adi_lista;
	}

	public void setIns_adi_lista(List<String> ins_adi_lista) {
		this.ins_adi_lista = ins_adi_lista;
	}

	public List<String> getTip_pre() {
		return tip_pre;
	}

	public void setTip_pre(List<String> tip_pre) {
		this.tip_pre = tip_pre;
	}

	public List<String> getMod_pre() {
		return mod_pre;
	}

	public void setMod_pre(List<String> mod_pre) {
		this.mod_pre = mod_pre;
	}

	public List<String> getPre() {
		return pre;
	}

	public void setPre(List<String> pre) {
		this.pre = pre;
	}

	public List<String> getMsg() {
		return msg;
	}

	public void setMsg(List<String> msg) {
		this.msg = msg;
	}

	public String getIns_adi() {
		return ins_adi;
	}

	public void setIns_adi(String ins_adi) {
		this.ins_adi = ins_adi;
	}

	public String getCam_serv() {
		return cam_serv;
	}

	public void setCam_serv(String cam_serv) {
		this.cam_serv = cam_serv;
	}

	public String getShop_codigo() {
		return shop_codigo;
	}

	public void setShop_codigo(String shop_codigo) {
		this.shop_codigo = shop_codigo;
	}

	public String getFrec_codigo() {
		return frec_codigo;
	}

	public void setFrec_codigo(String frec_codigo) {
		this.frec_codigo = frec_codigo;
	}

	public String getLat_rec() {
		return lat_rec;
	}

	public void setLat_rec(String lat_rec) {
		this.lat_rec = lat_rec;
	}

	public String getLng_rec() {
		return lng_rec;
	}

	public void setLng_rec(String lng_rec) {
		this.lng_rec = lng_rec;
	}

	public String getLat_ent() {
		return lat_ent;
	}

	public void setLat_ent(String lat_ent) {
		this.lat_ent = lat_ent;
	}

	public String getLng_ent() {
		return lng_ent;
	}

	public void setLng_ent(String lng_ent) {
		this.lng_ent = lng_ent;
	}
	
}
