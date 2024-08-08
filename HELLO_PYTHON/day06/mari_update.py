import pymysql


con = pymysql.connect(host='localhost', port=3305, user='root', passwd='python', db='python', charset='utf8')

cur = con.cursor(pymysql.cursors.DictCursor)

e_id = "6"
e_name = "7"
gen = "7"
addr = "7"

sql = f"""
    UPDATE emp
      SET
        e_name = '{e_name}',
        gen = '{gen}',
        addr = '{addr}' 
    WHERE
        e_id = '{e_id}'
    """

cur.execute(sql)
print("cnt", cur.rowcount)
con.commit()

cur.close()
con.close()