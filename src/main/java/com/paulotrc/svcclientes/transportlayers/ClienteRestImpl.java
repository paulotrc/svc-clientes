package com.paulotrc.svcclientes.transportlayers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ClienteRestImpl {


    @Operation(summary = "Gets the list of available books")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the books",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseEntity.class)) }),
    })
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/sample/{id}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> get(
            @Parameter(name = "id", description = "Description Parameter", required = true) @PathVariable("id") Integer id
    ) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
