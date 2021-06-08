package coop.home.backacount.dto;

import coop.home.backacount.config.constant.Constantes.JwtVariables;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenBackAcountDTO {
	private String token;
	
	public String getLoginUser() {
		String jwtToken = token.replace(JwtVariables.BEARER, "");
		Claims claims = Jwts.parser().setSigningKey(JwtVariables.LLAVE_SECRETA.getBytes()).parseClaimsJws(jwtToken).getBody();
		return claims.getSubject();
	}

}
