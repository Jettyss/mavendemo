package geex.gong.mavenprovider.service;

import geex.gong.mavencommon.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Value("${server.port}")
    private String port;

    @Override
    public String say() {
        return "这个是服务提供者"+port;
    }
}
