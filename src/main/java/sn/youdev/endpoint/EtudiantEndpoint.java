package sn.youdev.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import sn.youdev.model.Etudiant;
import sn.youdev.repository.EtudiantRepository;
//import sn.youdev.ws.StudentRequest;
import sn.youdev.ws.StudentResponse;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import java.util.Calendar;


import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;


@Endpoint @AllArgsConstructor
public class EtudiantEndpoint {
    private final EtudiantRepository etudiantRepository;
    private static final String NAMESPACE_URI = "http://ws.youdev.sn";
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudents")
//    @ResponsePayload
//    public List<StudentResponse> getCountry() {
//        return etudiantRepository.findAll().stream().map(x-> {
//            try {
//                return x.toResponse();
//            } catch (DatatypeConfigurationException e) {
//                throw new RuntimeException(e);
//            }
//        }).toList();
//    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addStudents")
    @ResponsePayload
    public StudentResponse createStudent(@RequestPayload StudentResponse request) throws DatatypeConfigurationException {
        System.out.println("Called");
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(request.getNom());
        return etudiant.toResponse();
    }
}
