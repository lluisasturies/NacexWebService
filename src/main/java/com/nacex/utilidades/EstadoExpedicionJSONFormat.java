package com.nacex.utilidades;

import org.json.JSONObject;

public class EstadoExpedicionJSONFormat {
	public String formatea(String data) {
		
		String[] resultado = data.split("\\|");
		
		JSONObject jsonObject = new JSONObject();
		
        jsonObject.put("codExp", resultado[0]);
        jsonObject.put("fecha", resultado[1]);
        jsonObject.put("hora", resultado[2]);
        jsonObject.put("obs", resultado[3]);
        jsonObject.put("estado", resultado[4]);
        jsonObject.put("codEstado", resultado[5]);
        jsonObject.put("delOrigen", resultado[6]);
        jsonObject.put("albaran", resultado[7]);
        
		String jsonString = jsonObject.toString();
		
		return jsonString;
	}
}
