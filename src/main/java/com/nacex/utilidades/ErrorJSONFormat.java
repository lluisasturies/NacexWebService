package com.nacex.utilidades;

import org.json.JSONObject;

public class ErrorJSONFormat {
	public String formatea(String data) {
		
		String[] resultado = data.split("\\|");
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("errorCod", resultado[2]);
        jsonObject.put("estado", resultado[1]);
        
        String jsonString = jsonObject.toString();
		
		return jsonString;
	}
}
