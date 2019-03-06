启动vue
npm run server

配置maven镜像
```
<servers>
    <server>
        <id>skm-public</id>
        <username>skm-dev</username>
        <password>skm@2018</password>
    </server>
    <server>
        <id>skm-repo</id>
        <username>skm-dev</username>
        <password>skm@2018</password>
    </server>
</servers>
<mirrors>
    <mirror>
        <id>skm-public</id>
        <mirrorOf>*,!central</mirrorOf>
        <name>skm-public</name>
        <url>http://nexus.84deban.com/repository/skm-public/</url>
    </mirror>
</mirrors>
```
