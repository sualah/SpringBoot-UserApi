package org.zekula.api.user_api.models.response;

public class UserRest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
