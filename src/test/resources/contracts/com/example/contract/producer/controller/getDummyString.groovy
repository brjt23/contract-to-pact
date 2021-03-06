package com.example.contract.producer.controller

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return a list of dummy object with dummy value. Generates pact with empty json"
    request {
        method GET()
        url("/dummy")
    }
    response {
        body("""[{"value": "Hi! I'm a dummy object ;)"}]""")
        headers {
            contentType applicationJson()
        }
        status 200
    }
}

