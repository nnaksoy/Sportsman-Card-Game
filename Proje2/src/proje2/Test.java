
package proje2;

import java.awt.Color;
import java.util.ArrayList;


public class Test extends javax.swing.JFrame {

    Futbolcu mbwanaSamatta = new Futbolcu("Mbwana Samatta", "Fenerbahçe");
    Futbolcu ozanTufan = new Futbolcu("Ozan tufan", "Fenerbahçe");
    Futbolcu joseSosa = new Futbolcu("José Sosa", "Fenerbahçe");
    Futbolcu diegoPerotti = new Futbolcu("Diego Perotti", "Fenerbahçe");
    Futbolcu papissCisse = new Futbolcu("Papiss Cissé", "Fenerbahçe");
    Futbolcu luizGustavo = new Futbolcu("Luiz Gustavo", "Fenerbahçe");
    Futbolcu canerErkin = new Futbolcu("Caner Erkin", "Fenerbahçe");
    Futbolcu dimitrisPelkas = new Futbolcu("Dimitris Pelkas", "Fenerbahçe");

    Basketbolcu aliMuhammed = new Basketbolcu("Ali Muhammed", "Fenerbahçe");
    Basketbolcu melihMahmutoglu = new Basketbolcu("Melih Mahmutoğlu", "Fenerbahçe");
    Basketbolcu janVesely = new Basketbolcu("Jan Vasely", "Fenerbahçe");
    Basketbolcu lorenzoBrown = new Basketbolcu("Lorenzo Brown", "Fenerbahçe");
    Basketbolcu nandodeColo = new Basketbolcu("Nando de Colo", "Fenerbahçe");
    Basketbolcu kenanSipahi = new Basketbolcu("Kenan Sipahi", "Fenerbahçe");
    Basketbolcu dyshawnPierre = new Basketbolcu("sthan Hamilton", "Fenerbahçe");
    Basketbolcu daniloTimonBarthel = new Basketbolcu("Danilo Timon Barthel", "Fenerbahçe");
    ArrayList<Basketbolcu> basketbolcuKart = new ArrayList<>();
    ArrayList<Futbolcu> futbolcuKart = new ArrayList<>();
    ArrayList<Futbolcu> pcFutbolcuKart = new ArrayList<>();
    ArrayList<Basketbolcu> pcBasketbolcuKart = new ArrayList<>();
    Oyuncu kullanici = new Kullanici("kullanici5","Kullanıcı Adı",10);
    Oyuncu pc = new Bilgisayar("pc5","BİLGİSAYAR",0);
    int sonkart = 0;
    int gerial = 0;

    public Test() {
        initComponents();

        diegoPerotti.setResimBilgisi("/proje2.img/Perotti.png");
        mbwanaSamatta.setResimBilgisi("/proje2/img/Samatta.png");
        ozanTufan.setResimBilgisi("/proje2/img/Ozan.png");
        joseSosa.setResimBilgisi("/proje2/img/Sosa.png");
        diegoPerotti.setResimBilgisi("/proje2/img/Perotti.png");
        papissCisse.setResimBilgisi("/proje2/img/Cisse.png");
        luizGustavo.setResimBilgisi("/proje2/img/Gustavo.png");
        canerErkin.setResimBilgisi("/proje2/img/CanerErkin.png");
        dimitrisPelkas.setResimBilgisi("/proje2/img/Pelkas.png");
        futbolcuKartEkle();

        aliMuhammed.setResimBilgisi("/proje2/img/Ali.png");
        melihMahmutoglu.setResimBilgisi("/proje2/img/Melih.png");
        janVesely.setResimBilgisi("/proje2/img/Vesely.png");
        lorenzoBrown.setResimBilgisi("/proje2/img/Brown.png");
        nandodeColo.setResimBilgisi("/proje2/img/Decolo.png");
        kenanSipahi.setResimBilgisi("/proje2/img/Kenan.png");
        dyshawnPierre.setResimBilgisi("/proje2/img/Pierre.png");
        daniloTimonBarthel.setResimBilgisi("/proje2/img/Barthel.png");
        basketbolcuKartEkle();

        kartlariDagit.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);

        kullaniciF1.setVisible(false);
        kullaniciF2.setVisible(false);
        kullaniciF3.setVisible(false);
        kullaniciF4.setVisible(false);
        kullaniciB1.setVisible(false);
        kullaniciB2.setVisible(false);
        kullaniciB3.setVisible(false);
        kullaniciB4.setVisible(false);

        kullaniciKarti.setVisible(false);
        pcKarti.setVisible(false);

        ozellik();

        skorTablosu.setVisible(false);
        kullaniciSkor.setVisible(false);
        pcSkor.setVisible(false);
        kullaniciSkorBilgisi.setVisible(false);
        pcSkorBilgisi.setVisible(false);

        pozisyon.setVisible(false);
        hangiPozisyon.setVisible(false);
        hangiPozisyon2.setVisible(false);

        sonucTablosu.setVisible(false);
        sonSkor.setVisible(false);
        sonDurum.setVisible(false);
        isimGir.setVisible(false);
        jText_isim.setVisible(false);
        oyunaBasla.setOpaque(true);
        oyunaBasla.setBackground(Color.red);
        kullaniciKarti.setOpaque(true);
        kullaniciKarti.setBackground(Color.red);
        pcKarti.setOpaque(true);
        pcKarti.setBackground(Color.red);

    }

    private void ozellik() {

        mbwanaSamatta.setKaleciKarsiKarsiya(95);
        ozanTufan.setKaleciKarsiKarsiya(80);
        joseSosa.setKaleciKarsiKarsiya(85);
        diegoPerotti.setKaleciKarsiKarsiya(90);
        papissCisse.setKaleciKarsiKarsiya(85);
        luizGustavo.setKaleciKarsiKarsiya(80);
        canerErkin.setKaleciKarsiKarsiya(75);
        dimitrisPelkas.setKaleciKarsiKarsiya(82);

        mbwanaSamatta.setPenalti(90);
        ozanTufan.setPenalti(85);
        joseSosa.setPenalti(95);
        diegoPerotti.setPenalti(95);
        papissCisse.setPenalti(80);
        luizGustavo.setPenalti(75);
        canerErkin.setPenalti(85);
        dimitrisPelkas.setPenalti(78);

        mbwanaSamatta.setSerbestVurus(75);
        ozanTufan.setSerbestVurus(80);
        joseSosa.setSerbestVurus(95);
        diegoPerotti.setSerbestVurus(85);
        papissCisse.setSerbestVurus(70);
        luizGustavo.setSerbestVurus(65);
        canerErkin.setSerbestVurus(90);
        dimitrisPelkas.setSerbestVurus(78);

        aliMuhammed.setIkilikAtis(90);
        melihMahmutoglu.setIkilikAtis(85);
        janVesely.setIkilikAtis(80);
        lorenzoBrown.setIkilikAtis(95);
        nandodeColo.setIkilikAtis(90);
        kenanSipahi.setIkilikAtis(75);
        dyshawnPierre.setIkilikAtis(87);
        daniloTimonBarthel.setIkilikAtis(84);

        aliMuhammed.setSerbestAtis(85);
        melihMahmutoglu.setSerbestAtis(83);
        janVesely.setSerbestAtis(90);
        lorenzoBrown.setSerbestAtis(92);
        nandodeColo.setSerbestAtis(88);
        kenanSipahi.setSerbestAtis(82);
        dyshawnPierre.setSerbestAtis(86);
        daniloTimonBarthel.setSerbestAtis(84);

        aliMuhammed.setUclukAtis(95);
        melihMahmutoglu.setUclukAtis(95);
        janVesely.setUclukAtis(82);
        lorenzoBrown.setUclukAtis(85);
        nandodeColo.setUclukAtis(81);
        kenanSipahi.setUclukAtis(84);
        dyshawnPierre.setUclukAtis(88);
        daniloTimonBarthel.setUclukAtis(80);

    }

    private void futbolcuKartEkle() {
        futbolcuKart.add(mbwanaSamatta);
        futbolcuKart.add(ozanTufan);
        futbolcuKart.add(joseSosa);
        futbolcuKart.add(diegoPerotti);
        futbolcuKart.add(papissCisse);
        futbolcuKart.add(luizGustavo);
        futbolcuKart.add(canerErkin);
        futbolcuKart.add(dimitrisPelkas);

    }

    private void basketbolcuKartEkle() {
        basketbolcuKart.add(aliMuhammed);
        basketbolcuKart.add(melihMahmutoglu);
        basketbolcuKart.add(janVesely);
        basketbolcuKart.add(lorenzoBrown);
        basketbolcuKart.add(nandodeColo);
        basketbolcuKart.add(kenanSipahi);
        basketbolcuKart.add(dyshawnPierre);
        basketbolcuKart.add(daniloTimonBarthel);

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslik = new javax.swing.JLabel();
        jText_isim = new javax.swing.JTextField();
        isimGir = new javax.swing.JLabel();
        sonDurum = new javax.swing.JLabel();
        sonSkor = new javax.swing.JLabel();
        sonucTablosu = new javax.swing.JLabel();
        hangiPozisyon2 = new javax.swing.JLabel();
        hangiPozisyon = new javax.swing.JLabel();
        pozisyon = new javax.swing.JLabel();
        pcSkorBilgisi = new javax.swing.JLabel();
        kullaniciSkorBilgisi = new javax.swing.JLabel();
        pcSkor = new javax.swing.JLabel();
        kullaniciSkor = new javax.swing.JLabel();
        skorTablosu = new javax.swing.JLabel();
        pcKarti = new javax.swing.JButton();
        kullaniciKarti = new javax.swing.JButton();
        kullaniciB1 = new javax.swing.JButton();
        kullaniciB2 = new javax.swing.JButton();
        kullaniciB3 = new javax.swing.JButton();
        kullaniciB4 = new javax.swing.JButton();
        kullaniciF4 = new javax.swing.JButton();
        kullaniciF3 = new javax.swing.JButton();
        kullaniciF2 = new javax.swing.JButton();
        kullaniciF1 = new javax.swing.JButton();
        kartlariDagit = new javax.swing.JButton();
        oyunaBasla = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        arkaplan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        baslik.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        baslik.setForeground(new java.awt.Color(204, 0, 0));
        baslik.setText("SPORCU KART OYUNU");
        getContentPane().add(baslik);
        baslik.setBounds(630, 30, 660, 140);

        jText_isim.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jText_isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_isimActionPerformed(evt);
            }
        });
        getContentPane().add(jText_isim);
        jText_isim.setBounds(810, 570, 330, 40);

        isimGir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adınızı Giriniz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(204, 0, 0))); // NOI18N
        getContentPane().add(isimGir);
        isimGir.setBounds(750, 510, 470, 150);

        sonDurum.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        sonDurum.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(sonDurum);
        sonDurum.setBounds(720, 820, 550, 90);

        sonSkor.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        getContentPane().add(sonSkor);
        sonSkor.setBounds(730, 760, 570, 50);

        sonucTablosu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SONUÇ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 36), new java.awt.Color(204, 0, 0))); // NOI18N
        getContentPane().add(sonucTablosu);
        sonucTablosu.setBounds(590, 700, 760, 230);

        hangiPozisyon2.setBackground(new java.awt.Color(0, 0, 0));
        hangiPozisyon2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        hangiPozisyon2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Son kartta eşitlik durumu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        getContentPane().add(hangiPozisyon2);
        hangiPozisyon2.setBounds(80, 520, 510, 80);

        hangiPozisyon.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        hangiPozisyon.setText("SEÇİLEN POZİSYON");
        getContentPane().add(hangiPozisyon);
        hangiPozisyon.setBounds(90, 440, 560, 60);

        pozisyon.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        pozisyon.setForeground(new java.awt.Color(204, 0, 0));
        pozisyon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KARŞILAŞTIRILAN POZİSYON", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 36), new java.awt.Color(204, 0, 0))); // NOI18N
        pozisyon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(pozisyon);
        pozisyon.setBounds(60, 370, 610, 260);

        pcSkorBilgisi.setBackground(new java.awt.Color(0, 0, 0));
        pcSkorBilgisi.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        pcSkorBilgisi.setText("0");
        getContentPane().add(pcSkorBilgisi);
        pcSkorBilgisi.setBounds(1620, 530, 70, 50);

        kullaniciSkorBilgisi.setBackground(new java.awt.Color(0, 0, 0));
        kullaniciSkorBilgisi.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        kullaniciSkorBilgisi.setText("0");
        getContentPane().add(kullaniciSkorBilgisi);
        kullaniciSkorBilgisi.setBounds(1620, 450, 70, 50);

        pcSkor.setBackground(new java.awt.Color(0, 0, 0));
        pcSkor.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        pcSkor.setText("BİLGİSAYAR");
        pcSkor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(pcSkor);
        pcSkor.setBounds(1300, 530, 290, 50);

        kullaniciSkor.setBackground(new java.awt.Color(0, 0, 0));
        kullaniciSkor.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        kullaniciSkor.setText("OYUNCU");
        kullaniciSkor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(kullaniciSkor);
        kullaniciSkor.setBounds(1300, 450, 280, 50);

        skorTablosu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SKOR TABLOSU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 36), new java.awt.Color(204, 0, 0))); // NOI18N
        getContentPane().add(skorTablosu);
        skorTablosu.setBounds(1270, 370, 600, 260);
        getContentPane().add(pcKarti);
        pcKarti.setBounds(980, 340, 220, 330);
        getContentPane().add(kullaniciKarti);
        kullaniciKarti.setBounds(740, 340, 220, 330);

        kullaniciB1.setText("jButton1");
        kullaniciB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciB1ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciB1);
        kullaniciB1.setBounds(1150, 700, 170, 300);

        kullaniciB2.setText("jButton1");
        kullaniciB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciB2ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciB2);
        kullaniciB2.setBounds(1340, 700, 160, 300);

        kullaniciB3.setText("jButton2");
        kullaniciB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciB3ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciB3);
        kullaniciB3.setBounds(1530, 700, 160, 300);

        kullaniciB4.setText("jButton1");
        kullaniciB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciB4ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciB4);
        kullaniciB4.setBounds(1710, 700, 170, 300);

        kullaniciF4.setText("jButton1");
        kullaniciF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciF4ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciF4);
        kullaniciF4.setBounds(580, 700, 160, 300);

        kullaniciF3.setText("jButton1");
        kullaniciF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciF3ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciF3);
        kullaniciF3.setBounds(400, 700, 170, 300);

        kullaniciF2.setText("jButton1");
        kullaniciF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciF2ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciF2);
        kullaniciF2.setBounds(220, 700, 170, 300);

        kullaniciF1.setText("jButton1");
        kullaniciF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciF1ActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciF1);
        kullaniciF1.setBounds(30, 700, 170, 300);

        kartlariDagit.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        kartlariDagit.setText("KARTLARI DAĞIT");
        kartlariDagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartlariDagitActionPerformed(evt);
            }
        });
        getContentPane().add(kartlariDagit);
        kartlariDagit.setBounds(800, 700, 330, 170);

        oyunaBasla.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        oyunaBasla.setText("OYUNA BAŞLA");
        oyunaBasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyunaBaslaActionPerformed(evt);
            }
        });
        getContentPane().add(oyunaBasla);
        oyunaBasla.setBounds(800, 700, 330, 170);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1240, 290, 130, 220);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1420, 280, 130, 240);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1590, 280, 130, 240);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1740, 280, 130, 240);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1240, 30, 130, 240);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1410, 30, 130, 230);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1580, 30, 130, 230);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1740, 30, 130, 240);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 280, 130, 230);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 280, 130, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 280, 130, 230);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 280, 130, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 20, 130, 240);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 20, 130, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 130, 232);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/kartarkasi.jpg"))); // NOI18N
        jLabel16.setText("Samatta");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 20, 130, 232);

        arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proje2/img/ArkaPlan2.jpg"))); // NOI18N
        arkaplan.setText("jLabel1");
        arkaplan.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(arkaplan);
        arkaplan.setBounds(10, -10, 1920, 1080);

        jPanel2.setMinimumSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 510, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int index1 = 0;
    int index2 = 0;
    int index3 = 0;
    int index4 = 0;
    int index5 = 0;
    int index6 = 0;
    int index7 = 0;
    int index8 = 0;

    public void kullaniciAtama() {


        int hangiIndex1 = (int) (Math.random() * 8);

        if (futbolcuKart.get(hangiIndex1).isKartKullanildiMi() == false) {
            kullaniciF1.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(hangiIndex1).resimBilgisi)));
            futbolcuKart.get(hangiIndex1).setKartKullanildiMi(true);
            index1 = hangiIndex1;

        }
        int hangiIndex2 = (int) (Math.random() * 8);
        while (hangiIndex2 == hangiIndex1) {
            hangiIndex2 = (int) (Math.random() * 8);
        }
        if (futbolcuKart.get(hangiIndex2).isKartKullanildiMi() == false) {
            kullaniciF2.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(hangiIndex2).resimBilgisi)));
            futbolcuKart.get(hangiIndex2).setKartKullanildiMi(true);
            index2 = hangiIndex2;

        }
        int hangiIndex3 = (int) (Math.random() * 8);
        while (hangiIndex3 == hangiIndex2 || hangiIndex3 == hangiIndex1) {
            hangiIndex3 = (int) (Math.random() * 8);
        }
        if (futbolcuKart.get(hangiIndex3).isKartKullanildiMi() == false) {
            kullaniciF3.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(hangiIndex3).resimBilgisi)));
            futbolcuKart.get(hangiIndex3).setKartKullanildiMi(true);
            index3 = hangiIndex3;

        }
        int hangiIndex4 = (int) (Math.random() * 8);
        while (hangiIndex4 == hangiIndex1 || hangiIndex4 == hangiIndex2 || hangiIndex4 == hangiIndex3) {
            hangiIndex4 = (int) (Math.random() * 8);
        }

        if (futbolcuKart.get(hangiIndex4).isKartKullanildiMi() == false) {
            kullaniciF4.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(hangiIndex4).resimBilgisi)));
            futbolcuKart.get(hangiIndex4).setKartKullanildiMi(true);
            index4 = hangiIndex4;

        }

        hangiIndex1 = (int) (Math.random() * 8);

        if (basketbolcuKart.get(hangiIndex1).isKartKullanildiMi() == false) {
            kullaniciB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(hangiIndex1).resimBilgisi)));
            basketbolcuKart.get(hangiIndex1).setKartKullanildiMi(true);
            index5 = hangiIndex1;

        }
        hangiIndex2 = (int) (Math.random() * 8);
        while (hangiIndex2 == hangiIndex1) {
            hangiIndex2 = (int) (Math.random() * 8);
        }
        if (basketbolcuKart.get(hangiIndex2).isKartKullanildiMi() == false) {
            kullaniciB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(hangiIndex2).resimBilgisi)));
            basketbolcuKart.get(hangiIndex2).setKartKullanildiMi(true);
            index6 = hangiIndex2;

        }
        hangiIndex3 = (int) (Math.random() * 8);
        while (hangiIndex3 == hangiIndex2 || hangiIndex3 == hangiIndex1) {
            hangiIndex3 = (int) (Math.random() * 8);
        }
        if (basketbolcuKart.get(hangiIndex3).isKartKullanildiMi() == false) {
            kullaniciB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(hangiIndex3).resimBilgisi)));
            basketbolcuKart.get(hangiIndex3).setKartKullanildiMi(true);
            index7 = hangiIndex3;

        }
        hangiIndex4 = (int) (Math.random() * 8);
        while (hangiIndex4 == hangiIndex1 || hangiIndex4 == hangiIndex2 || hangiIndex4 == hangiIndex3) {
            hangiIndex4 = (int) (Math.random() * 8);
        }

        if (basketbolcuKart.get(hangiIndex4).isKartKullanildiMi() == false) {
            kullaniciB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(hangiIndex4).resimBilgisi)));
            basketbolcuKart.get(hangiIndex4).setKartKullanildiMi(true);
            index8 = hangiIndex4;

        }

    }

    public void pcAtama() {

        int hangiIndex1 = (int) (Math.random() * 8);
        while (futbolcuKart.get(hangiIndex1).isKartKullanildiMi() == true) {
            hangiIndex1 = (int) (Math.random() * 8);
        }

        if (futbolcuKart.get(hangiIndex1).isKartKullanildiMi() == false) {
            futbolcuKart.get(hangiIndex1).setKartKullanildiMi(true);
            pcFutbolcuKart.add(futbolcuKart.get(hangiIndex1));

        }
        int hangiIndex2 = (int) (Math.random() * 8);
        while (hangiIndex2 == hangiIndex1 || futbolcuKart.get(hangiIndex2).isKartKullanildiMi() == true) {
            hangiIndex2 = (int) (Math.random() * 8);
        }

        if (futbolcuKart.get(hangiIndex2).isKartKullanildiMi() == false) {
            futbolcuKart.get(hangiIndex2).setKartKullanildiMi(true);
            pcFutbolcuKart.add(futbolcuKart.get(hangiIndex2));

        }
        int hangiIndex3 = (int) (Math.random() * 8);
        while (hangiIndex3 == hangiIndex2 || hangiIndex3 == hangiIndex1 || futbolcuKart.get(hangiIndex3).isKartKullanildiMi() == true) {
            hangiIndex3 = (int) (Math.random() * 8);
        }
        if (futbolcuKart.get(hangiIndex3).isKartKullanildiMi() == false) {
            futbolcuKart.get(hangiIndex3).setKartKullanildiMi(true);
            pcFutbolcuKart.add(futbolcuKart.get(hangiIndex3));

        }
        int hangiIndex4 = (int) (Math.random() * 8);
        while (hangiIndex4 == hangiIndex1 || hangiIndex4 == hangiIndex2 || hangiIndex4 == hangiIndex3 || futbolcuKart.get(hangiIndex4).isKartKullanildiMi() == true) {
            hangiIndex4 = (int) (Math.random() * 8);
        }

        if (futbolcuKart.get(hangiIndex4).isKartKullanildiMi() == false) {
            futbolcuKart.get(hangiIndex4).setKartKullanildiMi(true);
            pcFutbolcuKart.add(futbolcuKart.get(hangiIndex4));

        }

        hangiIndex1 = (int) (Math.random() * 8);
        while (basketbolcuKart.get(hangiIndex1).isKartKullanildiMi() == true) {
            hangiIndex1 = (int) (Math.random() * 8);
        }

        if (basketbolcuKart.get(hangiIndex1).isKartKullanildiMi() == false) {
            basketbolcuKart.get(hangiIndex1).setKartKullanildiMi(true);
            pcBasketbolcuKart.add(basketbolcuKart.get(hangiIndex1));

        }
        hangiIndex2 = (int) (Math.random() * 8);
        while (hangiIndex2 == hangiIndex1 || basketbolcuKart.get(hangiIndex2).isKartKullanildiMi() == true) {
            hangiIndex2 = (int) (Math.random() * 8);
        }
        if (basketbolcuKart.get(hangiIndex2).isKartKullanildiMi() == false) {
            basketbolcuKart.get(hangiIndex2).setKartKullanildiMi(true);
            pcBasketbolcuKart.add(basketbolcuKart.get(hangiIndex2));

        }
        hangiIndex3 = (int) (Math.random() * 8);
        while (hangiIndex3 == hangiIndex2 || hangiIndex3 == hangiIndex1 || basketbolcuKart.get(hangiIndex3).isKartKullanildiMi() == true) {
            hangiIndex3 = (int) (Math.random() * 8);
        }
        if (basketbolcuKart.get(hangiIndex3).isKartKullanildiMi() == false) {
            basketbolcuKart.get(hangiIndex3).setKartKullanildiMi(true);
            pcBasketbolcuKart.add(basketbolcuKart.get(hangiIndex3));

        }
        hangiIndex4 = (int) (Math.random() * 8);
        while (hangiIndex4 == hangiIndex1 || hangiIndex4 == hangiIndex2 || hangiIndex4 == hangiIndex3 || basketbolcuKart.get(hangiIndex4).isKartKullanildiMi() == true) {
            hangiIndex4 = (int) (Math.random() * 8);
        }

        if (basketbolcuKart.get(hangiIndex4).isKartKullanildiMi() == false) {
            basketbolcuKart.get(hangiIndex4).setKartKullanildiMi(true);
            pcBasketbolcuKart.add(basketbolcuKart.get(hangiIndex4));

        }

    }

    private void oyunaBaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyunaBaslaActionPerformed
        oyunaBasla.setVisible(false);
        isimGir.setVisible(true);
        jText_isim.setVisible(true);
        baslik.setVisible(false);

    }//GEN-LAST:event_oyunaBaslaActionPerformed

    private void kartlariDagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartlariDagitActionPerformed
        kartlariDagit.setVisible(false);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(true);

        kullaniciAtama();
        pcAtama();

        kullaniciF1.setVisible(true);
        kullaniciF2.setVisible(true);
        kullaniciF3.setVisible(true);
        kullaniciF4.setVisible(true);
        kullaniciB1.setVisible(true);
        kullaniciB2.setVisible(true);
        kullaniciB3.setVisible(true);
        kullaniciB4.setVisible(true);

        skorTablosu.setVisible(true);
        kullaniciSkor.setVisible(true);
        pcSkor.setVisible(true);
        kullaniciSkorBilgisi.setVisible(true);
        pcSkorBilgisi.setVisible(true);
        pozisyon.setVisible(true);
        hangiPozisyon.setVisible(true);

        pozisyon.setOpaque(true);
        pozisyon.setBackground(Color.WHITE);
        skorTablosu.setOpaque(true);
        skorTablosu.setBackground(Color.WHITE);
        sonucTablosu.setOpaque(true);
        sonucTablosu.setBackground(Color.WHITE);

        kullaniciB1.setEnabled(false);
        kullaniciB2.setEnabled(false);
        kullaniciB3.setEnabled(false);
        kullaniciB4.setEnabled(false);

        hangiPozisyon2.setVisible(false);


    }//GEN-LAST:event_kartlariDagitActionPerformed

    private void kullaniciF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciF2ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index2).resimBilgisi)));
        kullaniciF2.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcFutbolcuKart.get(1).resimBilgisi)));
        jLabel3.setVisible(false);

        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("PENALTI");
            if (futbolcuKart.get(index2).getPenalti() > pcFutbolcuKart.get(1).getPenalti()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index2).getPenalti() < pcFutbolcuKart.get(1).getPenalti()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index2).getPenalti() == pcFutbolcuKart.get(1).getPenalti() && sonkart < 8) {

                sonkart--;
                kullaniciF2.setVisible(true);
                jLabel3.setVisible(true);
                kullaniciF2.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index2).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("KALECİYLE KARŞI KARŞIYA");
            if (futbolcuKart.get(index2).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(1).getKaleciKarsiKarsiya()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index2).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(1).getKaleciKarsiKarsiya()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index2).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(1).getKaleciKarsiKarsiya() && sonkart < 8) {

                sonkart--;
                kullaniciF2.setVisible(true);
                jLabel3.setVisible(true);
                kullaniciF2.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index2).resimBilgisi)));

            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST VURUŞ");
            if (futbolcuKart.get(index2).getSerbestVurus() > pcFutbolcuKart.get(1).getSerbestVurus()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index2).getSerbestVurus() < pcFutbolcuKart.get(1).getSerbestVurus()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index2).getSerbestVurus() == pcFutbolcuKart.get(1).getSerbestVurus() && sonkart < 8) {

                sonkart--;
                kullaniciF2.setVisible(true);
                jLabel3.setVisible(true);
                kullaniciF2.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index2).resimBilgisi)));
            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }
        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && futbolcuKart.get(index2).getPenalti() == pcFutbolcuKart.get(1).getPenalti()) || (sonkart == 8 && rastgele == 1 && futbolcuKart.get(index2).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(1).getKaleciKarsiKarsiya())
                    || (sonkart == 8 && rastgele == 2 && futbolcuKart.get(index2).getSerbestVurus() == pcFutbolcuKart.get(1).getSerbestVurus())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:PENALTI");
                    if (futbolcuKart.get(index2).getPenalti() > pcFutbolcuKart.get(1).getPenalti()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index2).getPenalti() < pcFutbolcuKart.get(1).getPenalti()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:KALECİYLE KARŞI KARŞIYA");
                    if (futbolcuKart.get(index2).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(1).getKaleciKarsiKarsiya()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index2).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(1).getKaleciKarsiKarsiya()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST VURUŞ");
                    if (futbolcuKart.get(index2).getSerbestVurus() > pcFutbolcuKart.get(1).getSerbestVurus()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index2).getSerbestVurus() < pcFutbolcuKart.get(1).getSerbestVurus()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster())  + " " + pc.oyuncuAdi);

        }

        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(false);
            kullaniciF2.setEnabled(false);
            kullaniciF3.setEnabled(false);
            kullaniciF4.setEnabled(false);
        }

    }//GEN-LAST:event_kullaniciF2ActionPerformed


    private void kullaniciF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciF1ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index1).resimBilgisi)));
        kullaniciF1.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcFutbolcuKart.get(0).resimBilgisi)));
        jLabel2.setVisible(false);

        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("PENALTI");
            if (futbolcuKart.get(index1).getPenalti() > pcFutbolcuKart.get(0).getPenalti()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index1).getPenalti() < pcFutbolcuKart.get(0).getPenalti()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index1).getPenalti() == pcFutbolcuKart.get(0).getPenalti() && sonkart < 8) {

                sonkart--;
                kullaniciF1.setVisible(true);
                jLabel2.setVisible(true);
                kullaniciF1.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index1).resimBilgisi)));

            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("KALECİYLE KARŞI KARŞIYA");
            if (futbolcuKart.get(index1).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(0).getKaleciKarsiKarsiya()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index1).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(0).getKaleciKarsiKarsiya()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index1).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(0).getKaleciKarsiKarsiya() && sonkart < 8) {

                sonkart--;
                kullaniciF1.setVisible(true);
                jLabel2.setVisible(true);
                kullaniciF1.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index1).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST VURUŞ");
            if (futbolcuKart.get(index1).getSerbestVurus() > pcFutbolcuKart.get(0).getSerbestVurus()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index1).getSerbestVurus() < pcFutbolcuKart.get(0).getSerbestVurus()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index1).getSerbestVurus() == pcFutbolcuKart.get(0).getSerbestVurus() && sonkart < 8) {

                sonkart--;
                kullaniciF1.setVisible(true);
                jLabel2.setVisible(true);
                kullaniciF1.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index1).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }
        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && futbolcuKart.get(index1).getPenalti() == pcFutbolcuKart.get(0).getPenalti()) || (sonkart == 8 && rastgele == 1 && futbolcuKart.get(index1).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(0).getKaleciKarsiKarsiya())
                    || (sonkart == 8 && rastgele == 2 && futbolcuKart.get(index1).getSerbestVurus() == pcFutbolcuKart.get(0).getSerbestVurus())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:PENALTI");
                    if (futbolcuKart.get(index1).getPenalti() > pcFutbolcuKart.get(0).getPenalti()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index1).getPenalti() < pcFutbolcuKart.get(0).getPenalti()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:KALECİYLE KARŞI KARŞIYA");
                    if (futbolcuKart.get(index1).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(0).getKaleciKarsiKarsiya()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index1).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(0).getKaleciKarsiKarsiya()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST VURUŞ");
                    if (futbolcuKart.get(index1).getSerbestVurus() > pcFutbolcuKart.get(0).getSerbestVurus()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index1).getSerbestVurus() < pcFutbolcuKart.get(0).getSerbestVurus()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster())  + " " +pc.oyuncuAdi);

        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(false);
            kullaniciF2.setEnabled(false);
            kullaniciF3.setEnabled(false);
            kullaniciF4.setEnabled(false);
        }

    }//GEN-LAST:event_kullaniciF1ActionPerformed

    private void kullaniciF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciF3ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index3).resimBilgisi)));
        kullaniciF3.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcFutbolcuKart.get(2).resimBilgisi)));

        jLabel16.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("PENALTI");
            if (futbolcuKart.get(index3).getPenalti() > pcFutbolcuKart.get(2).getPenalti()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index3).getPenalti() < pcFutbolcuKart.get(2).getPenalti()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index3).getPenalti() == pcFutbolcuKart.get(2).getPenalti() && sonkart < 8) {

                sonkart--;
                kullaniciF3.setVisible(true);
                jLabel16.setVisible(true);
                kullaniciF3.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index3).resimBilgisi)));
            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("KALECİYLE KARŞI KARŞIYA");
            if (futbolcuKart.get(index3).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(2).getKaleciKarsiKarsiya()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index3).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(2).getKaleciKarsiKarsiya()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index3).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(2).getKaleciKarsiKarsiya() && sonkart < 8) {

                sonkart--;
                kullaniciF3.setVisible(true);
                jLabel16.setVisible(true);
                kullaniciF3.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index3).resimBilgisi)));
            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST VURUŞ");
            if (futbolcuKart.get(index3).getSerbestVurus() > pcFutbolcuKart.get(2).getSerbestVurus()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index3).getSerbestVurus() < pcFutbolcuKart.get(2).getSerbestVurus()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index3).getSerbestVurus() == pcFutbolcuKart.get(2).getSerbestVurus() && sonkart < 8) {

                sonkart--;
                kullaniciF3.setVisible(true);
                jLabel16.setVisible(true);
                kullaniciF3.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index3).resimBilgisi)));
            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }

        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && futbolcuKart.get(index3).getPenalti() == pcFutbolcuKart.get(2).getPenalti()) || (sonkart == 8 && rastgele == 1 && futbolcuKart.get(index3).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(2).getKaleciKarsiKarsiya())
                    || (sonkart == 8 && rastgele == 2 && futbolcuKart.get(index3).getSerbestVurus() == pcFutbolcuKart.get(2).getSerbestVurus())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:PENALTI");
                    if (futbolcuKart.get(index3).getPenalti() > pcFutbolcuKart.get(2).getPenalti()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index3).getPenalti() < pcFutbolcuKart.get(2).getPenalti()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:KALECİYLE KARŞI KARŞIYA");
                    if (futbolcuKart.get(index3).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(2).getKaleciKarsiKarsiya()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index3).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(2).getKaleciKarsiKarsiya()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST VURUŞ");
                    if (futbolcuKart.get(index3).getSerbestVurus() > pcFutbolcuKart.get(2).getSerbestVurus()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index3).getSerbestVurus() < pcFutbolcuKart.get(2).getSerbestVurus()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster()) + " "  + pc.oyuncuAdi);

        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(false);
            kullaniciF2.setEnabled(false);
            kullaniciF3.setEnabled(false);
            kullaniciF4.setEnabled(false);
        }
    }//GEN-LAST:event_kullaniciF3ActionPerformed

    private void kullaniciF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciF4ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index4).resimBilgisi)));
        kullaniciF4.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcFutbolcuKart.get(3).resimBilgisi)));
        jLabel1.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("PENALTI");
            if (futbolcuKart.get(index4).getPenalti() > pcFutbolcuKart.get(3).getPenalti()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index4).getPenalti() < pcFutbolcuKart.get(3).getPenalti()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index4).getPenalti() == pcFutbolcuKart.get(3).getPenalti() && sonkart < 8) {

                sonkart--;
                kullaniciF4.setVisible(true);
                jLabel1.setVisible(true);
                kullaniciF4.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index4).resimBilgisi)));
            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("KALECİYLE KARŞI KARŞIYA");
            if (futbolcuKart.get(index4).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(3).getKaleciKarsiKarsiya()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index4).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(3).getKaleciKarsiKarsiya()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index4).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(3).getKaleciKarsiKarsiya() && sonkart < 8) {

                sonkart--;
                kullaniciF4.setVisible(true);
                jLabel1.setVisible(true);
                kullaniciF4.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index4).resimBilgisi)));
            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST VURUŞ");
            if (futbolcuKart.get(index4).getSerbestVurus() > pcFutbolcuKart.get(3).getSerbestVurus()) {
                kullanici.Skor += 10;
            } else if (futbolcuKart.get(index4).getSerbestVurus() < pcFutbolcuKart.get(3).getSerbestVurus()) {
                pc.Skor += 10;
            } else if (futbolcuKart.get(index4).getSerbestVurus() == pcFutbolcuKart.get(3).getSerbestVurus() && sonkart < 8) {

                sonkart--;
                kullaniciF4.setVisible(true);
                jLabel1.setVisible(true);
                kullaniciF4.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuKart.get(index4).resimBilgisi)));
            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }

        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && futbolcuKart.get(index4).getPenalti() == pcFutbolcuKart.get(3).getPenalti()) || (sonkart == 8 && rastgele == 1 && futbolcuKart.get(index4).getKaleciKarsiKarsiya() == pcFutbolcuKart.get(3).getKaleciKarsiKarsiya())
                    || (sonkart == 8 && rastgele == 2 && futbolcuKart.get(index4).getSerbestVurus() == pcFutbolcuKart.get(3).getSerbestVurus())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:PENALTI");
                    if (futbolcuKart.get(index4).getPenalti() > pcFutbolcuKart.get(3).getPenalti()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index4).getPenalti() < pcFutbolcuKart.get(3).getPenalti()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:KALECİYLE KARŞI KARŞIYA");
                    if (futbolcuKart.get(index4).getKaleciKarsiKarsiya() > pcFutbolcuKart.get(3).getKaleciKarsiKarsiya()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index4).getKaleciKarsiKarsiya() < pcFutbolcuKart.get(3).getKaleciKarsiKarsiya()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST VURUŞ");
                    if (futbolcuKart.get(index4).getSerbestVurus() > pcFutbolcuKart.get(3).getSerbestVurus()) {
                        kullanici.Skor += 10;
                    } else if (futbolcuKart.get(index4).getSerbestVurus() < pcFutbolcuKart.get(3).getSerbestVurus()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster()) + " "  + pc.oyuncuAdi);

        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(false);
            kullaniciF2.setEnabled(false);
            kullaniciF3.setEnabled(false);
            kullaniciF4.setEnabled(false);
        }

    }//GEN-LAST:event_kullaniciF4ActionPerformed

    private void kullaniciB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciB1ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index5).resimBilgisi)));
        kullaniciB1.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcBasketbolcuKart.get(3).resimBilgisi)));
        jLabel9.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("İKİLİK ATIŞ");
            if (basketbolcuKart.get(index5).getIkilikAtis() > pcBasketbolcuKart.get(3).getIkilikAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index5).getIkilikAtis() < pcBasketbolcuKart.get(3).getIkilikAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index5).getIkilikAtis() == pcBasketbolcuKart.get(3).getIkilikAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB1.setVisible(true);
                jLabel9.setVisible(true);
                kullaniciB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index5).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("ÜÇLÜK ATIŞ");
            if (basketbolcuKart.get(index5).getUclukAtis() > pcBasketbolcuKart.get(3).getUclukAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index5).getUclukAtis() < pcBasketbolcuKart.get(3).getUclukAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index5).getUclukAtis() == pcBasketbolcuKart.get(3).getUclukAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB1.setVisible(true);
                jLabel9.setVisible(true);
                kullaniciB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index5).resimBilgisi)));

            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST ATIŞ");
            if (basketbolcuKart.get(index5).getSerbestAtis() > pcBasketbolcuKart.get(3).getSerbestAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index5).getSerbestAtis() < pcBasketbolcuKart.get(3).getSerbestAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index5).getSerbestAtis() == pcBasketbolcuKart.get(3).getSerbestAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB1.setVisible(true);
                jLabel9.setVisible(true);
                kullaniciB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index5).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }
        gerial++;
        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && basketbolcuKart.get(index5).getIkilikAtis() == pcBasketbolcuKart.get(3).getIkilikAtis()) || (sonkart == 8 && rastgele == 1 && basketbolcuKart.get(index5).getUclukAtis() == pcBasketbolcuKart.get(3).getUclukAtis())
                    || (sonkart == 8 && rastgele == 2 && basketbolcuKart.get(index5).getSerbestAtis() == pcBasketbolcuKart.get(3).getSerbestAtis())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:İKİLİK ATIŞ");
                    if (basketbolcuKart.get(index5).getIkilikAtis() > pcBasketbolcuKart.get(3).getIkilikAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index5).getIkilikAtis() < pcBasketbolcuKart.get(3).getIkilikAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:ÜÇLÜK ATIŞ");
                    if (basketbolcuKart.get(index5).getUclukAtis() > pcBasketbolcuKart.get(3).getUclukAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index5).getUclukAtis() < pcBasketbolcuKart.get(3).getUclukAtis()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST ATIŞ");
                    if (basketbolcuKart.get(index5).getSerbestAtis() > pcBasketbolcuKart.get(3).getSerbestAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index5).getSerbestAtis() < pcBasketbolcuKart.get(3).getSerbestAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }
            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster())  + " " + pc.oyuncuAdi);

        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(false);
            kullaniciB2.setEnabled(false);
            kullaniciB3.setEnabled(false);
            kullaniciB4.setEnabled(false);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        }

    }//GEN-LAST:event_kullaniciB1ActionPerformed

    private void kullaniciB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciB2ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index6).resimBilgisi)));
        kullaniciB2.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcBasketbolcuKart.get(2).resimBilgisi)));
        jLabel11.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("İKİLİK ATIŞ");
            if (basketbolcuKart.get(index6).getIkilikAtis() > pcBasketbolcuKart.get(2).getIkilikAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index6).getIkilikAtis() < pcBasketbolcuKart.get(2).getIkilikAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index6).getIkilikAtis() == pcBasketbolcuKart.get(2).getIkilikAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB2.setVisible(true);
                jLabel11.setVisible(true);
                kullaniciB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index6).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("ÜÇLÜK ATIŞ");
            if (basketbolcuKart.get(index6).getUclukAtis() > pcBasketbolcuKart.get(2).getUclukAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index6).getUclukAtis() < pcBasketbolcuKart.get(2).getUclukAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index6).getUclukAtis() == pcBasketbolcuKart.get(2).getUclukAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB2.setVisible(true);
                jLabel11.setVisible(true);
                kullaniciB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index6).resimBilgisi)));

            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST ATIŞ");
            if (basketbolcuKart.get(index6).getSerbestAtis() > pcBasketbolcuKart.get(2).getSerbestAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index6).getSerbestAtis() < pcBasketbolcuKart.get(2).getSerbestAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index6).getSerbestAtis() == pcBasketbolcuKart.get(2).getSerbestAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB2.setVisible(true);
                jLabel11.setVisible(true);
                kullaniciB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index6).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }
        kullaniciB1.setEnabled(false);
        kullaniciB2.setEnabled(false);
        kullaniciB3.setEnabled(false);
        kullaniciB4.setEnabled(false);
        kullaniciF1.setEnabled(true);
        kullaniciF2.setEnabled(true);
        kullaniciF3.setEnabled(true);
        kullaniciF4.setEnabled(true);
        gerial++;

        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && basketbolcuKart.get(index6).getIkilikAtis() == pcBasketbolcuKart.get(2).getIkilikAtis()) || (sonkart == 8 && rastgele == 1 && basketbolcuKart.get(index6).getUclukAtis() == pcBasketbolcuKart.get(2).getUclukAtis())
                    || (sonkart == 8 && rastgele == 2 && basketbolcuKart.get(index6).getSerbestAtis() == pcBasketbolcuKart.get(2).getSerbestAtis())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:İKİLİK ATIŞ");
                    if (basketbolcuKart.get(index6).getIkilikAtis() > pcBasketbolcuKart.get(2).getIkilikAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index6).getIkilikAtis() < pcBasketbolcuKart.get(2).getIkilikAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:ÜÇLÜK ATIŞ");
                    if (basketbolcuKart.get(index6).getUclukAtis() > pcBasketbolcuKart.get(2).getUclukAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index6).getUclukAtis() < pcBasketbolcuKart.get(2).getUclukAtis()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST ATIŞ");
                    if (basketbolcuKart.get(index6).getSerbestAtis() > pcBasketbolcuKart.get(2).getSerbestAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index6).getSerbestAtis() < pcBasketbolcuKart.get(2).getSerbestAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster()) + " "  + pc.oyuncuAdi);
        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(false);
            kullaniciB2.setEnabled(false);
            kullaniciB3.setEnabled(false);
            kullaniciB4.setEnabled(false);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        }
    }//GEN-LAST:event_kullaniciB2ActionPerformed

    private void kullaniciB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciB3ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index7).resimBilgisi)));
        kullaniciB3.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcBasketbolcuKart.get(1).resimBilgisi)));
        jLabel8.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("İKİLİK ATIŞ");
            if (basketbolcuKart.get(index7).getIkilikAtis() > pcBasketbolcuKart.get(1).getIkilikAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index7).getIkilikAtis() < pcBasketbolcuKart.get(1).getIkilikAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index7).getIkilikAtis() == pcBasketbolcuKart.get(1).getIkilikAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB3.setVisible(true);
                jLabel8.setVisible(true);
                kullaniciB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index7).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 1) {
            hangiPozisyon.setText("ÜÇLÜK ATIŞ");
            if (basketbolcuKart.get(index7).getUclukAtis() > pcBasketbolcuKart.get(1).getUclukAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index7).getUclukAtis() < pcBasketbolcuKart.get(1).getUclukAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index7).getUclukAtis() == pcBasketbolcuKart.get(1).getUclukAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB3.setVisible(true);
                jLabel8.setVisible(true);
                kullaniciB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index7).resimBilgisi)));

            }

            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST ATIŞ");
            if (basketbolcuKart.get(index7).getSerbestAtis() > pcBasketbolcuKart.get(1).getSerbestAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index7).getSerbestAtis() < pcBasketbolcuKart.get(1).getSerbestAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index7).getSerbestAtis() == pcBasketbolcuKart.get(1).getSerbestAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB3.setVisible(true);
                jLabel8.setVisible(true);
                kullaniciB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index7).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }
        gerial++;

        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && basketbolcuKart.get(index7).getIkilikAtis() == pcBasketbolcuKart.get(1).getIkilikAtis()) || (sonkart == 8 && rastgele == 1 && basketbolcuKart.get(index7).getUclukAtis() == pcBasketbolcuKart.get(1).getUclukAtis())
                    || (sonkart == 8 && rastgele == 2 && basketbolcuKart.get(index7).getSerbestAtis() == pcBasketbolcuKart.get(1).getSerbestAtis())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:İKİLİK ATIŞ");
                    if (basketbolcuKart.get(index7).getIkilikAtis() > pcBasketbolcuKart.get(1).getIkilikAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index7).getIkilikAtis() < pcBasketbolcuKart.get(1).getIkilikAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:ÜÇLÜK ATIŞ");
                    if (basketbolcuKart.get(index7).getUclukAtis() > pcBasketbolcuKart.get(1).getUclukAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index7).getUclukAtis() < pcBasketbolcuKart.get(1).getUclukAtis()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST ATIŞ");
                    if (basketbolcuKart.get(index7).getSerbestAtis() > pcBasketbolcuKart.get(1).getSerbestAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index7).getSerbestAtis() < pcBasketbolcuKart.get(1).getSerbestAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster())  + " " +pc.oyuncuAdi);
        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(false);
            kullaniciB2.setEnabled(false);
            kullaniciB3.setEnabled(false);
            kullaniciB4.setEnabled(false);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        }
    }//GEN-LAST:event_kullaniciB3ActionPerformed

    private void kullaniciB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciB4ActionPerformed
        kullaniciKarti.setVisible(true);
        kullaniciKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index8).resimBilgisi)));
        kullaniciB4.setVisible(false);
        pcKarti.setVisible(true);
        pcKarti.setIcon(new javax.swing.ImageIcon(getClass().getResource(pcBasketbolcuKart.get(0).resimBilgisi)));
        jLabel10.setVisible(false);
        sonkart++;
        int rastgele = (int) (Math.random() * 3);
        if (rastgele == 0) {
            hangiPozisyon.setText("İKİLİK ATIŞ");
            if (basketbolcuKart.get(index8).getIkilikAtis() > pcBasketbolcuKart.get(0).getIkilikAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index8).getIkilikAtis() < pcBasketbolcuKart.get(0).getIkilikAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index8).getIkilikAtis() == pcBasketbolcuKart.get(0).getIkilikAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB4.setVisible(true);
                jLabel10.setVisible(true);
                kullaniciB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index8).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));

        } else if (rastgele == 1) {
            hangiPozisyon.setText("ÜÇLÜK ATIŞ");
            if (basketbolcuKart.get(index8).getUclukAtis() > pcBasketbolcuKart.get(0).getUclukAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index8).getUclukAtis() < pcBasketbolcuKart.get(0).getUclukAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index8).getUclukAtis() == pcBasketbolcuKart.get(0).getUclukAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB4.setVisible(true);
                jLabel10.setVisible(true);
                kullaniciB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index8).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        } else if (rastgele == 2) {
            hangiPozisyon.setText("SERBEST ATIŞ");
            if (basketbolcuKart.get(index8).getSerbestAtis() > pcBasketbolcuKart.get(0).getSerbestAtis()) {
                kullanici.Skor += 10;
            } else if (basketbolcuKart.get(index8).getSerbestAtis() < pcBasketbolcuKart.get(0).getSerbestAtis()) {
                pc.Skor += 10;
            } else if (basketbolcuKart.get(index8).getSerbestAtis() == pcBasketbolcuKart.get(0).getSerbestAtis() && sonkart < 8) {

                sonkart--;
                kullaniciB4.setVisible(true);
                jLabel10.setVisible(true);
                kullaniciB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuKart.get(index8).resimBilgisi)));

            }
            kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
            pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
        }

        gerial++;

        int rastgele1 = (int) (Math.random() * 3);
        if (sonkart == 8) {

            if ((sonkart == 8 && rastgele == 0 && basketbolcuKart.get(index8).getIkilikAtis() == pcBasketbolcuKart.get(0).getIkilikAtis()) || (sonkart == 8 && rastgele == 1 && basketbolcuKart.get(index8).getUclukAtis() == pcBasketbolcuKart.get(0).getUclukAtis())
                    || (sonkart == 8 && rastgele == 2 && basketbolcuKart.get(index8).getSerbestAtis() == pcBasketbolcuKart.get(0).getSerbestAtis())) {
                hangiPozisyon2.setVisible(true);
                while (rastgele == rastgele1) {
                    rastgele1 = (int) (Math.random() * 3);
                }
                if (rastgele1 == 0) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:İKİLİK ATIŞ");
                    if (basketbolcuKart.get(index8).getIkilikAtis() > pcBasketbolcuKart.get(0).getIkilikAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index8).getIkilikAtis() < pcBasketbolcuKart.get(0).getIkilikAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 1) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:ÜÇLÜK ATIŞ");
                    if (basketbolcuKart.get(index8).getUclukAtis() > pcBasketbolcuKart.get(0).getUclukAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index8).getUclukAtis() < pcBasketbolcuKart.get(0).getUclukAtis()) {
                        pc.Skor += 10;
                    }

                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                } else if (rastgele1 == 2) {
                    hangiPozisyon2.setText("Tekrar karşılaştırılan pozisyon:SERBEST ATIŞ");
                    if (basketbolcuKart.get(index8).getSerbestAtis() > pcBasketbolcuKart.get(0).getSerbestAtis()) {
                        kullanici.Skor += 10;
                    } else if (basketbolcuKart.get(index8).getSerbestAtis() < pcBasketbolcuKart.get(0).getSerbestAtis()) {
                        pc.Skor += 10;
                    }
                    kullaniciSkorBilgisi.setText(String.valueOf(kullanici.SkorGoster()));
                    pcSkorBilgisi.setText(String.valueOf(pc.SkorGoster()));
                }

            }
            sonucTablosu.setVisible(true);
            sonSkor.setVisible(true);
            sonDurum.setVisible(true);
            if (kullanici.Skor > pc.Skor) {
                sonDurum.setText("KAZANDINIZ! :)");
            } else if (kullanici.Skor < pc.Skor) {
                sonDurum.setText("KAYBETTİNİZ! :(");
            } else if (kullanici.Skor == pc.Skor) {
                sonDurum.setText("BERABERE! :|");
            }
            sonSkor.setText(kullanici.oyuncuAdi + " " + String.valueOf(kullanici.SkorGoster()) + "-" + String.valueOf(pc.SkorGoster()) + " "  +pc.oyuncuAdi);

        }
        if (gerial == 4) {
            kullaniciB1.setEnabled(true);
            kullaniciB2.setEnabled(true);
            kullaniciB3.setEnabled(true);
            kullaniciB4.setEnabled(true);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        } else {
            kullaniciB1.setEnabled(false);
            kullaniciB2.setEnabled(false);
            kullaniciB3.setEnabled(false);
            kullaniciB4.setEnabled(false);
            kullaniciF1.setEnabled(true);
            kullaniciF2.setEnabled(true);
            kullaniciF3.setEnabled(true);
            kullaniciF4.setEnabled(true);
        }
    }//GEN-LAST:event_kullaniciB4ActionPerformed

    private void jText_isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_isimActionPerformed
        kullanici.oyuncuAdi =jText_isim.getText();
        kartlariDagit.setVisible(true);
        kartlariDagit.setOpaque(true);
        kartlariDagit.setBackground(Color.red);
        isimGir.setVisible(false);
        jText_isim.setVisible(false);
        kullaniciSkor.setText(kullanici.oyuncuAdi);
        pcSkor.setText(pc.oyuncuAdi);

        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
    }//GEN-LAST:event_jText_isimActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaplan;
    private javax.swing.JLabel baslik;
    private javax.swing.JLabel hangiPozisyon;
    private javax.swing.JLabel hangiPozisyon2;
    private javax.swing.JLabel isimGir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jText_isim;
    private javax.swing.JButton kartlariDagit;
    private javax.swing.JButton kullaniciB1;
    private javax.swing.JButton kullaniciB2;
    private javax.swing.JButton kullaniciB3;
    private javax.swing.JButton kullaniciB4;
    private javax.swing.JButton kullaniciF1;
    private javax.swing.JButton kullaniciF2;
    private javax.swing.JButton kullaniciF3;
    private javax.swing.JButton kullaniciF4;
    private javax.swing.JButton kullaniciKarti;
    private javax.swing.JLabel kullaniciSkor;
    private javax.swing.JLabel kullaniciSkorBilgisi;
    private javax.swing.JButton oyunaBasla;
    private javax.swing.JButton pcKarti;
    private javax.swing.JLabel pcSkor;
    private javax.swing.JLabel pcSkorBilgisi;
    private javax.swing.JLabel pozisyon;
    private javax.swing.JLabel skorTablosu;
    private javax.swing.JLabel sonDurum;
    private javax.swing.JLabel sonSkor;
    private javax.swing.JLabel sonucTablosu;
    // End of variables declaration//GEN-END:variables
}
