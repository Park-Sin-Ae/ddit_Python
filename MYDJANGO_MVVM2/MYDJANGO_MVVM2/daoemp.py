import pymysql

class DaoEmp :
    def __init__(self):
        self.con = pymysql.connect(host='localhost', port=3305, user='root', passwd='python', db='python', charset='utf8')
        self.cur = self.con.cursor(pymysql.cursors.DictCursor)
        # self.cur = self.con.cursor()
        
    def selectList(self):
        sql = """
            SELECT
                e_id, e_name, gen, addr
            FROM emp
        """
        self.cur.execute(sql)
        
        list = self.cur.fetchall()
        return list
    
    def selectOne(self, e_id):
        sql = f"""
            SELECT
                e_id, e_name, gen, addr
            FROM emp
            WHERE e_id = '{e_id}'
        """
        self.cur.execute(sql)
        
        vo = self.cur.fetchone()
        return vo
    
    def insert(self, e_id, e_name, gen, addr):
        sql = f"""
            INSERT INTO emp
                (e_id, e_name, gen, addr)
            VALUES
            ('{e_id}','{e_name}','{gen}','{addr}')
        """
        cnt = self.cur.execute(sql)
        self.con.commit()
        
        return cnt
    
    def update(self, e_id, e_name, gen, addr):
        sql = f"""
            UPDATE emp
              SET
                e_name = '{e_name}',
                gen = '{gen}',
                addr = '{addr}' 
            WHERE
                e_id = '{e_id}'
        """
        cnt = self.cur.execute(sql)
        self.con.commit()
        return cnt
    
    def delete(self, e_id):
        sql = f"""
        DELETE FROM emp
        WHERE
            e_id = '{e_id}'
        """
        cnt = self.cur.execute(sql)
        self.con.commit()
        return cnt
        
    def __del__(self):
        self.cur.close()
        self.con.close()
    

if __name__ == '__main__' :
    de = DaoEmp()
    cnt = de.delete('3')
    print("cnt", cnt)