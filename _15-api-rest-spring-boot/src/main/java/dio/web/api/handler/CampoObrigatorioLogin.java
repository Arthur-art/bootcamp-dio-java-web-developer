package dio.web.api.handler;

public class CampoObrigatorioLogin extends BusinessException{
    public CampoObrigatorioLogin(String message) {
        super(message);
    }

    public CampoObrigatorioLogin(String message, Object... params) {
        super(message, params);
    }
}
