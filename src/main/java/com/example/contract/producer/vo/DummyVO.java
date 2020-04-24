package com.example.contract.producer.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DummyVO {
	private String value;
}
