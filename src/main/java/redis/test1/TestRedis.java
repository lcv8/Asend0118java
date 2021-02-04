package redis.test1;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.select(0);
        Set<String> keys = jedis.keys("*");
        keys.forEach(key -> System.out.println("key => " + key));
        jedis.close();

    }
}
