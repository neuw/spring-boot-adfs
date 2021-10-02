package in.n2w.openid.web.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karanbir Singh on 09/15/2021
 */
@RestController
public class AdfsOpenIdController {

    @GetMapping
    public OidcUser getLoggedInUserDetails(@AuthenticationPrincipal OidcUser principal) {
        return principal;
    }

}
