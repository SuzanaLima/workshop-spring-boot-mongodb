package com.suzanalima.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suzanalima.workshopmongo.Service.UserService;
import com.suzanalima.workshopmongo.domain.User;
import com.suzanalima.workshopmongo.dto.UserDto;

@RestController 
@RequestMapping(value="/users") 
public class UserResources {
		
		@Autowired 
		private UserService userService;
	
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<UserDto>> findAll(){
			List<User> list = userService.findAll();
			List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect((Collectors.toList()));
			return ResponseEntity.ok().body(listDto);
		}
}
