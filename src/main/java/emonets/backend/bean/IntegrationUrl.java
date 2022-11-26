package emonets.backend.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntegrationUrl {
    private String frontend;
    private String backend;
    public IntegrationUrl(String frontend, String backend) {
        this.frontend = frontend;
        this.backend = backend;
    }
}
