package com.nacex.utilidades;

import org.json.JSONObject;

public class AgenciaJSONFormat {
	public String formatea(String data) {
		
		String[] resultado = data.split("\\|");
		
		JSONObject jsonObject = new JSONObject();
		
        jsonObject.put("codAgencia", resultado[0]);
        jsonObject.put("nombre", resultado[1]);
        jsonObject.put("direccion", resultado[2]);
        jsonObject.put("tel", resultado[3]);
        
		String jsonString = jsonObject.toString();
		
		return jsonString;
	}
}
