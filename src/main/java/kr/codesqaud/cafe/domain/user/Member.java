package kr.codesqaud.cafe.domain.user;

public class Member {

//    private Long userSequence;
    private String userId;
    private String password;
    private String name;
    private String email;

	public Member() {
	}

	public Member(String userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

//    public Long getUserSequence() {
//        return userSequence;
//    }
//
//    public void setUserSequence(Long userSequence) {
//        this.userSequence = userSequence;
//    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
