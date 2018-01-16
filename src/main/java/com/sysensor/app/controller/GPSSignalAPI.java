package com.sysensor.app.controller;

import com.sysensor.app.config.APIConfig;
import com.sysensor.app.model.Location;
import org.apache.log4j.Logger;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIConfig.API)
public class GPSSignalAPI {

    public static final String APPLICATION_JSON = "application/json";

    Logger LOG = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/signal", method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Location getLatestSignal() {
        Location location = new Location();
        location.setLat("41.619549");
        location.setLng("-93.598022");

        LOG.info("Returning the Latest Location" + location.toString());
        return location;
    }

    @RequestMapping(value = "/signal", method = RequestMethod.POST, consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
    @PreAuthorize("hasRole('ADMIN')")
    public Location postSignal(@RequestBody Location location) {
        LOG.info(location.toString());
        return location;
    }
}
