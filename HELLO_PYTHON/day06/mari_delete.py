import pymysql


con = pymysql.connect(host='localhost', port=3305, user='root', passwd='python', db='python', charset='utf8')

cur = con.cursor(pymysql.cursors.DictCursor)

e_id = "6"

sql = f"""
    DELETE FROM emp
    WHERE
        e_id = '{e_id}'
    """

cur.execute(sql)
print("cnt", cur.rowcount)
con.commit()

cur.close()
con.close()