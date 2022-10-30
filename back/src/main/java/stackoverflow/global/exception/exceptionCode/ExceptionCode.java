package stackoverflow.global.exception.exceptionCode;

import lombok.Getter;

public enum ExceptionCode {

    NOT_FOUND(404, "요청하신 데이터를 찾을 수 없습니다."),
    NOT_FOUND_ACCOUNT(400, "Account를 찾을 수 없습니다."),
    ACCOUNT_EXIST(400, "이미 회원가입된 Email입니다."),
    NOT_FOUND_QUESTION(400, "Question을 찾을 수 없습니다."),
    NON_ACCESS_MODIFY(400, "수정 권한이 없습니다.");

    @Getter
    private int status;
    @Getter
    private String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
