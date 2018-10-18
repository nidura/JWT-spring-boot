# JWT-spring-boot
JWT(Json Web Token) Without User Authentication(no user roles,no username/password)

## Follow these steps to test JWT
  
API to generate token 

		URL: http:localhost:8090/token/generate-token
		Method: POST
		Payload: { "name": "nidura", "nic": "952324244V"}
	
API to get All Person
		
		URL: http:localhost:8090/api/person
		Method: GET
		Header:
		Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuaWR1cmEiLCJuaWMiOiI5NTIzMjQyNDRWIiwiaWF0IjoxNTM5ODY0MDM5LCJleHAiOjE1Mzk4ODIwMzl9.2OGIpBhL98x7RCQkw8EsuWBnfEzXEu5ZrVWdoUms-DY 			
 

		
		
