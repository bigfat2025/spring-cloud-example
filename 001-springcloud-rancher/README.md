# Spring Cloud Rancher 示例项目

## 备注信息

### 服务启动顺序
1. **启动注册中心**：确保服务[eureka-server](eureka-server)注册中心先启动，以便其他服务能够注册和发现。
4. **启动核心业务服务**：按照服务依赖关系依次启动，先启动[cloud-provider](cloud-provider)服务、再启动[cloud-consumer](cloud-consumer)服务。
5. **启动网关服务**：最后启动[cloud-gateway](cloud-gateway) 网关，确保所有服务已注册完成。


> **注意**：Maven 会自动解析依赖关系，并按照依赖传递性进行处理，无需手动调整顺序，但建议保持清晰的组织结构以提高可读性。