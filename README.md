# 软件工作室管理系统后台管理说明文档

<p align="center">
	<img alt="logo" src="sdstudio-admin-ui/public/favicon.ico">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">软件工作室管理系统</h1>
<h4 align="center">基于SpringBoot和Vue的前后端分离架构</h4>

## 介绍

软件工作室管理系统是一个基于现代技术栈开发的综合管理平台，旨在帮助软件开发团队高效地管理项目、资源和进度。系统采用前后端分离架构，后端使用Spring Boot构建，前端基于Vue开发，支持模块化扩展，提供了从项目创建到代码管理、测试执行和团队协作的完整解决方案。

## 系统需求

- JDK >= 1.8
- MySQL >= 5.7
- Maven >= 3.0
- Node >= 12

## 技术选型

### 系统环境

- Java EE 8
- Servlet 3.0
- Apache Maven 3

### 主框架

- Spring Boot 2.2.x
- Spring Framework 5.2.x
- Spring Security 5.2.x

### 持久层

- Apache MyBatis 3.5.x
- Hibernate Validation 6.0.x
- Alibaba Druid 1.2.x

### 视图层

- Vue 2.6.x
- Axios 0.21.x
- Element UI 2.15.x

## 内置功能

1. **用户管理：** 管理系统用户的账户信息和权限设置。
2. **项目管理：** 创建和管理项目，分配任务并跟踪进度。
3. **代码管理：** 集成版本控制系统，支持代码审查和合并。
4. **测试管理：** 管理自动化测试用例，执行测试并分析结果。
5. **通知系统：** 实时消息和通知功能，保持团队沟通顺畅。
6. **日志管理：** 记录系统操作日志和异常日志，支持查询和分析。

## 安装与配置

### 克隆项目

```bash
git clone https://your-repo-url/software-studio-management.git
```

### 后端配置

1. **进入后端目录：**
   ```bash
   cd backend
   ```

2. **安装依赖并构建项目：**
   ```bash
   mvn clean install
   ```

3. **配置数据库连接：**
   编辑`src/main/resources/application.properties`文件，设置MySQL数据库连接信息。

4. **启动后端服务：**
   ```bash
   mvn spring-boot:run
   ```

### 前端配置

1. **进入前端目录：**
   ```bash
   cd frontend
   ```

2. **安装依赖：**
   ```bash
   npm install
   ```

3. **启动开发服务器：**
   ```bash
   npm run serve
   ```

## 使用指南

1. **登录系统：** 使用管理员账号进行登录，进入系统主页。
2. **管理项目：** 在项目管理模块中创建新项目，分配任务给团队成员。
3. **代码提交：** 在代码管理模块中提交代码，进行代码审查。
4. **执行测试：** 在测试管理模块中运行测试用例，查看测试结果和分析报告。
5. **查看日志：** 在日志管理模块中查看操作日志和异常日志，进行系统监控。

## 演示图

<table>
    <tr>
        <td><img src="sdstudio-admin-ui/public/systemImg/首页.png"/></td>
        <td><img src="sdstudio-admin-ui/public/systemImg/项目管理.png"/></td>
    </tr>
    <tr>
        <td><img src="sdstudio-admin-ui/public/systemImg/代码管理.png"/></td>
        <td><img src="sdstudio-admin-ui/public/systemImg/测试管理.png"/></td>
    </tr>
    <tr>
        <td><img src="sdstudio-admin-ui/public/systemImg/用户管理.png"/></td>
        <td><img src="sdstudio-admin-ui/public/systemImg/日志管理.png"/></td>
    </tr>
</table>

## 常见问题

1. **无法连接数据库：** 请检查数据库服务是否启动，并确认`application.properties`中的连接信息正确。
2. **前端页面加载缓慢：** 请确保Node.js及相关依赖正确安装，建议使用国内镜像加速下载。

## 联系方式

如有问题或建议，请联系技术支持团队：[3052992261@qq.com](mailto:support@example.com)

---

这份说明文档提供了软件工作室管理系统的背景、功能、安装步骤和使用方法，旨在帮助用户快速上手并有效利用系统进行项目管理和团队协作。
