package com.vishnu.Restaurant.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	@NotNull
	@UniqueElements
	private Integer id;
	@NotBlank
	private String restaurantName;
	@NotBlank
	private String restaurantAddress;
	@NotBlank
	@Size(min = 10,max = 10)
	private String restaurantNumber;
	private Speciality restaurantSpeciality;
	private Integer restaurantTotalStaff;
}
