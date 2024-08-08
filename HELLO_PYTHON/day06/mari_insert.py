import pymysql


con = pymysql.connect(host='localhost', port=3305, user='root', passwd='python', db='python', charset='utf8')

print(con)

cursor = con.cursor(pymysql.cursors.DictCursor)

print(cursor)

query = """
    INSERT INTO emp ( e_id,e_name,gen,addr)
    VALUES(%s,%s,%s,%s)
"""
data = (3,3,3,3)

cnt = cursor.execute(query,data)
print("cnt",cnt)
con.commit()
cursor.close()
con.close()

