FROM mysql:8.0

COPY conf.d/change_default_auth.cnf /etc/my.cnf

# 「/docker-entrypoint-initdb.d/」にSQLファイルを置いておくと、初回起動時に実行される
COPY init.d/*.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
