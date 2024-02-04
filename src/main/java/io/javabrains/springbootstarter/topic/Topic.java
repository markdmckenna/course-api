package io.javabrains.springbootstarter.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
}
