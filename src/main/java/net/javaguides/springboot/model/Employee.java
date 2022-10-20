package net.javaguides.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "employer")
    private String employer;

    @Column(name = "age")
    private String age;

    @Column(name = "academic_degree")
    private String academicDegree;

    @Column(name = "postgraduate_degree")
    private String postgraduateDegree;

    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "recruitment")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date recruitment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")

    @Column(name = "company")
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getPostgraduateDegree() {
        return postgraduateDegree;
    }

    public void setPostgraduateDegree(String postgraduateDegree) {
        this.postgraduateDegree = postgraduateDegree;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public Date getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Date recruitment) {
        this.recruitment = recruitment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }
}


