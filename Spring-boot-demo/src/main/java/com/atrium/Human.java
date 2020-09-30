package com.atrium;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Human {
private String name;

void sayName() {
	System.out.println(name);
}


}
