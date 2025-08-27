package dev.sheff.license.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Licensing {
  private int id;
  private String licenseId;
  private String description;
  private String organizationId;
  private String productName;
  private String licenseType;
}
