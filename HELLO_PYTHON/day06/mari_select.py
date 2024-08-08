
import pymysql
con = pymysql.connect(host='localhost', port=3305, user='root', passwd='python', db='python', charset='utf8')
# cur = conn.cursor(pymysql.cursors.DictCursor)
cur = con.cursor()

sql = """
    SELECT
        e_id, e_name, gen, addr
    FROM emp
    """
cur.execute(sql)

result = cur.fetchall()
print(result)


# conn.close()
cur.close()
con.close()