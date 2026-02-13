package com.intheeast.jpabook;

import jakarta.persistence.*;
import lombok.*;

<<<<<<< HEAD

@Setter
@Getter
@Entity
public class Person {

	public Person(long l, String string, String string2) {
		
	}

	
	
	
	
=======
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	
	@Id
	private Long id;
	
	private String name;
	
	private String phone;

>>>>>>> bf8d41e3490043e99bda4cd34171ae92d334312a
}
