package com.example.springbootdemo.apis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
	@GetMapping("demo")
	public ResponseEntity<Map<String, String>> demo(@RequestParam(required = false, defaultValue = "en") String lang,
			@RequestParam(required = false, defaultValue = "india") String country,
			@RequestParam(required = false) Integer year) {
		Map<String, String> map = new HashMap<>();
		map.put("message", "good afternoon");
		map.put("lang", lang);
		map.put("country", country);
		map.put("year", year == null ? "null" : Integer.toString(year));

		return ResponseEntity.ok(map);
	}
}
