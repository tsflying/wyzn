package cn.rxcards.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;

@Component
@Scope("prototype")
@RequestMapping("/downloadFile")
public class DownloadFileController {

	@RequestMapping("download")
	public ResponseEntity<byte[]> download() throws IOException {
		String path = ContextLoader.getCurrentWebApplicationContext()
				.getServletContext().getRealPath("/WEB-INF/downfile/rxzp.apk");
		// String path = ".\\downfile\\rxzp.apk";
		File file = new File(path);
		HttpHeaders headers = new HttpHeaders();
		String fileName = new String("rxzp.apk".getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
		headers.setContentDispositionFormData("attachment", fileName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
				headers, HttpStatus.CREATED);
	}
}
