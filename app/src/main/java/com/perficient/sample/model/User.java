package com.perficient.sample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by valamburi.murugan on 3/25/2017.
 */

public class User {
    //    "club_id": "0",
    @SerializedName("club_id")
    private String clubId;
    //    "date_of_birth": "1992-01-04T00:00:00+05:30",
    @SerializedName("date_of_birth")
    private String dob;
    //    "email_id": "vigneswari@eaglesoftware.com",
    @SerializedName("email_id")
    private String emailId;
    //    "first_name": "Qwerty",
    @SerializedName("first_name")
    private String firstName;
    //    "join_mail_list": "0",
    @SerializedName("join_mail_list")
    private String joinMailList;
    //    "last_name": "Qwerty",
    @SerializedName("last_name")
    private String lastName;
    //    "middle_name": "Qwerty",
    @SerializedName("middle_name")
    private String middleName;
    //    "mob_no": "8098901288",
    @SerializedName("mob_no")
    private String mobNum;
    //    "no_of_entries_per_draw": "0",
    @SerializedName("no_of_entries_per_draw")
    private String entPerDraw;
    //    "password": "3ACBCC5D076DFFE781DCC8D126B4B57C",
    @SerializedName("password")
    private String password;
    //    "payment_frequency": "0",
    @SerializedName("payment_frequency")
    private String paymentFreq;
    //    "payment_method": "3",
    @SerializedName("payment_method")
    private String paymentMethod;
    //    "sex": "M",
    @SerializedName("sex")
    private String sex;
    //    "status": "1",
    @SerializedName("status")
    private String status;
    //    "success": "true",
    @SerializedName("success")
    private String sccs;
    //    "success_message": "Login Successfully",
    @SerializedName("success_message")
    private String sccsMsg;
    //    "telephone_no": "1235686045",
    @SerializedName("telephone_no")
    private String telephoneNum;
    //    "user_id": "326",
    @SerializedName("user_id")
    private String userId;
    //    "user_name": "people12",
    @SerializedName("user_name")
    private String userName;
    //    "user_role": "0"
    @SerializedName("user_role")
    private String userRole;

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJoinMailList() {
        return joinMailList;
    }

    public void setJoinMailList(String joinMailList) {
        this.joinMailList = joinMailList;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public String getEntPerDraw() {
        return entPerDraw;
    }

    public void setEntPerDraw(String entPerDraw) {
        this.entPerDraw = entPerDraw;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaymentFreq() {
        return paymentFreq;
    }

    public void setPaymentFreq(String paymentFreq) {
        this.paymentFreq = paymentFreq;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSccs() {
        return sccs;
    }

    public void setSccs(String sccs) {
        this.sccs = sccs;
    }

    public String getSccsMsg() {
        return sccsMsg;
    }

    public void setSccsMsg(String sccsMsg) {
        this.sccsMsg = sccsMsg;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("clubId='").append(clubId).append('\'');
        sb.append(", dob='").append(dob).append('\'');
        sb.append(", emailId='").append(emailId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", joinMailList='").append(joinMailList).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", mobNum='").append(mobNum).append('\'');
        sb.append(", entPerDraw='").append(entPerDraw).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", paymentFreq='").append(paymentFreq).append('\'');
        sb.append(", paymentMethod='").append(paymentMethod).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", sccs='").append(sccs).append('\'');
        sb.append(", sccsMsg='").append(sccsMsg).append('\'');
        sb.append(", telephoneNum='").append(telephoneNum).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userRole='").append(userRole).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
