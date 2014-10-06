package sk.upjs.ics.citatnik;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import java.util.Random;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabazovyCitatDao implements CitatDao {

    private JdbcTemplate jdbcTemplate;
    
    public DatabazovyCitatDao() {
        MysqlDataSource datovyZdroj = new MysqlDataSource();
        datovyZdroj.setDatabaseName("citaty");
        datovyZdroj.setServerName("localhost");
        datovyZdroj.setUser("citat");
        datovyZdroj.setPassword("heslo");
                
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(datovyZdroj);
    }
    
    
    @Override
    public Citat findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Citat citat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        return jdbcTemplate.queryForInt("SELECT COUNT(*) FROM citat");
    }

    @Override
    public Citat dajNahodnyCitat() {
        int pocetCitatov = count();
        int nahodnyIndex = (int) (Math.random() * pocetCitatov);
        String sql = "SELECT * FROM citat LIMIT " + nahodnyIndex + ", 1";
        
        BeanPropertyRowMapper mapovac = BeanPropertyRowMapper.newInstance(Citat.class);
        return (Citat) jdbcTemplate.queryForObject(sql, mapovac);
    }
    
}
