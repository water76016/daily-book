from sqlalchemy import create_engine, text
from sqlalchemy.orm import sessionmaker

# 创建数据库连接（这里使用 PostgreSQL）
# 请将 'your_database' 替换为你的数据库名，'your_user' 替换为你的数据库用户名，'your_password' 替换为你的数据库密码，
# 'your_host' 和 'your_port' 分别替换为你的数据库主机和端口（如果默认是 5432 可以省略）
engine = create_engine('postgresql://postgres:abc+!@#123@localhost:5432/daily-book')

# 创建会话类
Session = sessionmaker(bind=engine)

# 创建会话对象
session = Session()

# 定义要执行的 SQL 查询
# sql_query = text("SELECT * FROM your_table WHERE some_column = :value")
sql_query = text("SELECT * FROM bill")

# 执行查询并传递参数（使用字典形式）
# results = session.execute(sql_query, {'value': 'some_value'}).fetchall()
results = session.execute(sql_query).fetchall()

# 处理查询结果
for row in results:
    print(row)  # row 是一个包含查询结果的元组

# 关闭会话
session.close()