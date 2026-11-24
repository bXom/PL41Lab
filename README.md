# PL41Lab

## Sentinel

### Sentinel Dashboard

项目根目录下已下载 Sentinel Dashboard：

```text
sentinel-dashboard-1.8.10.jar
```


启动 Dashboard：

```bash
java -Dserver.port=8718 -jar sentinel-dashboard-1.8.10.jar
```

启动成功后访问：

```text
http://127.0.0.1:8718
```

默认登录信息：

```text
用户名：sentinel
密码：sentinel
```

gateway 通过以下配置连接 Sentinel Dashboard：

```yaml
spring:
  cloud:
    sentinel:
      eager: true
      transport:
        dashboard: 127.0.0.1:8718
```

启动顺序：

1. 启动项目根目录下的 `sentinel-dashboard-1.8.10.jar`。
2. 启动 `pl41-gateway` 模块。
3. 访问 `http://127.0.0.1:8718` 查看 Sentinel 控制台。

Sentinel Dashboard 是独立运行的管理控制台服务，不会被打包进 gateway。gateway 中的 Sentinel 依赖作为客户端，通过网络连接 Dashboard。
