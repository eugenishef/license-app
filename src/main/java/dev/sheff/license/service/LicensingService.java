package dev.sheff.license.service;

import dev.sheff.license.model.Licensing;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicensingService {

  public Licensing getLicensing(String licenseId, String organizationId) {
    Licensing license = new Licensing();

    license.setId(new Random().nextInt(1000));
    license.setLicenseId(licenseId);
    license.setOrganizationId(organizationId);
  }
}
