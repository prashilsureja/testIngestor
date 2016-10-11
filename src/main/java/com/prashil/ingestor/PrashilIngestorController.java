package com.prashil.ingestor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prashil on 10/11/16.
 * test
 */

@RestController
@RequestMapping("/ingestor")
public class PrashilIngestorController {
    @RequestMapping("v1/ingest")
    void mask() {
        System.out.println("Ingested Data");
    }
}
