package sn.youdev.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import sn.youdev.ws.StudentResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Entity
@Table(name = "etudiants")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String prenom;
    private String nom;
//    private Calendar dateNaissance;
//    private String classe;
//    private String niveau;
    public StudentResponse toResponse() throws DatatypeConfigurationException {
        StudentResponse studentResponse = new StudentResponse();
//        studentResponse.setClasse(this.getClasse());
//        studentResponse.setPrenom(this.getPrenom());
        studentResponse.setNom(this.getNom());
//        studentResponse.setId(this.getId());
//        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        gregorianCalendar.setTime(this.dateNaissance.getTime());
//        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory
//                .newInstance()
//                .newXMLGregorianCalendar(gregorianCalendar);
//        studentResponse.setDateDeNaissance(xmlGregorianCalendar);
//        studentResponse.setNiveau(this.getNiveau());
        return studentResponse;
    }
}
