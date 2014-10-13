package sk.upjs.ics.citatnik;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum CitatDaoFactory {
    INSTANCE;

    private Logger logger = LoggerFactory.getLogger(CitatDaoFactory.class);

    public CitatDao vyrobCitatDao() {
        DatabazovyCitatDao citatDao = new DatabazovyCitatDao();
        logger.info("Vyrabam instanciu " + citatDao.getClass());
        return citatDao;
    }
}
