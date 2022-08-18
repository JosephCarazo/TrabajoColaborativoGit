/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajocolaborativogit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;

/**
 *
 * @author josep
 */
public class FrmMascota extends javax.swing.JFrame {

    private Clip clip;

    Mascota dragon;
    Alimentos galleta;
    Alimentos manzana;
    Alimentos huevo;
    Alimentos carne;
    Alimentos lava;
    Actividades natacion;
    Actividades dormir;
    Actividades futbol;
    Actividades volar;
    Actividades viajar;
    Bannio bannio;
    Medicamento pocion;

    /**
     * Creates new form FrmMascota
     */
    public FrmMascota() {
        initComponents();
        this.setLocationRelativeTo(null);

        galleta = new Galleta();
        manzana = new Manzana();
        huevo = new Huevo();
        carne = new Carne();
        lava = new Lava();
        dragon = new Mascota();

        natacion = new Natacion();
        dormir = new Dormir();
        futbol = new Futbol();
        volar = new Volar();
        viajar = new Viajar();
        bannio = new Bannio();

        pocion = new Pocion();

        jpAlimentos.setVisible(false);

        lblLava2.setVisible(false);
        lblHuevo2.setVisible(false);
        lblCarne2.setVisible(false);
        lblManzana2.setVisible(false);
        lblGalleta2.setVisible(false);
        lblViajar2.setVisible(false);
        lblFutbol2.setVisible(false);
        lblBannio2.setVisible(false);
        lblVolar2.setVisible(false);
        lblDormir2.setVisible(false);
        lblNatacion2.setVisible(false);
        jpActividades.setVisible(false);

        lblPocion2.setVisible(false);
        jpMedicamentos.setVisible(false);

        lblJoven.setVisible(false);
        lblAdulto.setVisible(false);
        lblEnfermo.setVisible(false);
        lblNombre.setText(FrmPrincipal.txtNombreTemp.getText());
        jpbAburrimiento.setValue(dragon.getAburrimiento());
        jpbHambre.setValue(dragon.getHambre());
        jpbNecesidades.setValue(dragon.getNecesidades());
        jpbEnergia.setValue(dragon.getEnergia());
        salud.start();
        hambre.start();
        edad.start();
        aburrimiento.start();
        necesidades.start();
        energia.start();
        muerte.start();

        Clip clip;
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/Sonidos/musica.wav")));
            clip.start();
        } catch (Exception e) {
        }
    }

    Timer hambre = new Timer(5000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            aumentarHambre();
        }
    });

    Timer aburrimiento = new Timer(7000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            aumentarAburrimiento();
        }
    });

    Timer necesidades = new Timer(7500, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            aumentarNecesidades();
        }
    });

    Timer energia = new Timer(10000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            disminuirEnergia();
        }
    });

    Timer edad = new Timer(60000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            aumentarEdad();
        }
    });

    Timer salud = new Timer(1, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            mostrarSalud();
        }
    });

    Timer muerte = new Timer(1, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            morir();
            muerte.stop();
        }
    });

    Timer pocionTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarPocion();
        }
    });

    Timer lavaTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarLava();
        }
    });

    Timer carneTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarCarne();
        }
    });

    Timer huevoTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarHuevo();
        }
    });

    Timer galletaTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarGalleta();
        }
    });

    Timer manzanaTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarManzana();
        }
    });

    Timer volarTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarVolar();
        }
    });

    Timer dormirTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarDormir();
        }
    });

    Timer futbolTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarFutbol();
        }
    });

    Timer bannioTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarBannio();
        }
    });

    Timer natacionTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarNatacion();
        }
    });

    Timer viajarTiempo = new Timer(1000, new ActionListener() {//METODO TIMER
        public void actionPerformed(ActionEvent e) {
            ocultarViajar();
        }
    });

    public void ocultarViajar() {
        viajar.setTiempo(viajar.getTiempo() + 1);
        if (viajar.getTiempo() == 10) {
            btnViajar.setVisible(true);
            lblViajar2.setVisible(false);
            viajarTiempo.stop();
            viajar.setTiempo(0);
        }
    }

    public void ocultarFutbol() {
        futbol.setTiempo(futbol.getTiempo() + 1);
        if (futbol.getTiempo() == 40) {
            btnFutbol.setVisible(true);
            lblFutbol2.setVisible(false);
            futbolTiempo.stop();
            futbol.setTiempo(0);
        }
    }

    public void ocultarDormir() {
        dormir.setTiempo(dormir.getTiempo() + 1);
        if (dormir.getTiempo() == 80) {
            btnDormir.setVisible(true);
            lblDormir2.setVisible(false);
            dormirTiempo.stop();
            dormir.setTiempo(0);
        }
    }

    public void ocultarVolar() {
        volar.setTiempo(volar.getTiempo() + 1);
        if (volar.getTiempo() == 10) {
            btnCaminar.setVisible(true);
            lblVolar2.setVisible(false);
            volarTiempo.stop();
            volar.setTiempo(0);
        }
    }

    public void ocultarNatacion() {
        natacion.setTiempo(natacion.getTiempo() + 1);
        if (natacion.getTiempo() == 8) {
            btnNatacion.setVisible(true);
            lblNatacion2.setVisible(false);
            natacionTiempo.stop();
            natacion.setTiempo(0);
        }
    }

    public void ocultarBannio() {
        bannio.setTiempo(bannio.getTiempo() + 1);
        if (bannio.getTiempo() == 90) {
            btnBannio.setVisible(true);
            lblBannio2.setVisible(false);
            bannioTiempo.stop();
            bannio.setTiempo(0);
        }
    }

    public void ocultarPocion() {
        pocion.setTiempo(pocion.getTiempo() + 1);
        if (pocion.getTiempo() == 60) {
            btnPocion.setVisible(true);
            lblPocion2.setVisible(false);
            pocionTiempo.stop();
            pocion.setTiempo(0);
        }
    }

    public void ocultarLava() {
        lava.setTiempo(lava.getTiempo() + 1);
        if (lava.getTiempo() == 30) {
            btnLava.setVisible(true);
            lblLava2.setVisible(false);
            lavaTiempo.stop();
            lava.setTiempo(0);
        }
    }

    public void ocultarCarne() {
        carne.setTiempo(carne.getTiempo() + 1);
        if (carne.getTiempo() == 20) {
            btnCarne.setVisible(true);
            lblCarne2.setVisible(false);
            carneTiempo.stop();
            carne.setTiempo(0);
        }
    }

    public void ocultarHuevo() {
        huevo.setTiempo(huevo.getTiempo() + 1);
        if (huevo.getTiempo() == 17) {
            btnHuevo.setVisible(true);
            lblHuevo2.setVisible(false);
            huevoTiempo.stop();
            huevo.setTiempo(0);
        }
    }

    public void ocultarGalleta() {
        galleta.setTiempo(galleta.getTiempo() + 1);
        if (galleta.getTiempo() == 10) {
            btnGalleta.setVisible(true);
            lblGalleta2.setVisible(false);
            galletaTiempo.stop();
            galleta.setTiempo(0);
        }
    }

    public void ocultarManzana() {
        manzana.setTiempo(manzana.getTiempo() + 1);
        if (manzana.getTiempo() == 6) {
            btnManzana.setVisible(true);
            lblManzana2.setVisible(false);
            manzanaTiempo.stop();
            manzana.setTiempo(0);
        }
    }

    public void aumentarHambre() {
        dragon.setHambre(dragon.getHambre() + 1);
        this.mostrarHambre();
    }

    public void disminuirEnergia() {
        dragon.setEnergia(dragon.getEnergia() - 1);
        this.mostarEnergia();
    }

    public void aumentarAburrimiento() {
        dragon.setAburrimiento(dragon.getAburrimiento() + 1);
        this.mostrarAburrimiento();
    }

    public void aumentarNecesidades() {
        dragon.setNecesidades(dragon.getNecesidades() + 1);
        this.mostrarNecesidades();
    }

    public void aumentarEdad() {
        dragon.setEdad(dragon.getEdad() + 1);
        if (dragon.getEdad() == 12) {
            lblBebe.setVisible(false);
            lblJoven.setVisible(true);
        }
        if (dragon.getEdad() == 18) {
            lblJoven.setVisible(false);
            lblAdulto.setVisible(true);
        }
        this.mostrarDia();
    }

    public void mostrarDia() {
        String annios = String.valueOf(dragon.getEdad());
        lblNumAnnios.setText(annios);
    }

    public void mostrarHambre() {
        jpbHambre.setValue(dragon.getHambre());
    }

    public void mostarEnergia() {
        jpbEnergia.setValue(dragon.getEnergia());
    }

    public void mostrarNecesidades() {
        jpbNecesidades.setValue(dragon.getNecesidades());
    }

    public void mostrarAburrimiento() {
        jpbAburrimiento.setValue(dragon.getAburrimiento());
    }

    public void mostrarSalud() {
        if (dragon.getAburrimiento() >= 90 || jpbEnergia.getValue() <= 10 || dragon.getHambre() >= 90 || dragon.getNecesidades() >= 90) {
            lblSaludable.setVisible(false);
            lblEnfermo.setVisible(true);
        } else {
            lblEnfermo.setVisible(false);
            lblSaludable.setVisible(true);
        }
    }

    public void morir() {
        FrmMorir muere = new FrmMorir();
        if (dragon.getAburrimiento() >= 90 && dragon.getHambre() >= 90) {
            muere.setVisible(true);
            this.dispose();
        } else if (dragon.getAburrimiento() >= 90 && dragon.getEnergia() <= 10) {
            muere.setVisible(true);
            this.dispose();
        } else if (dragon.getNecesidades() >= 90 && dragon.getAburrimiento() >= 90) {
            muere.setVisible(true);
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpActividades = new javax.swing.JPanel();
        btnBannio = new javax.swing.JButton();
        lblBannio2 = new javax.swing.JLabel();
        btnNatacion = new javax.swing.JButton();
        lblNatacion2 = new javax.swing.JLabel();
        btnDormir = new javax.swing.JButton();
        lblDormir2 = new javax.swing.JLabel();
        btnCaminar = new javax.swing.JButton();
        lblVolar2 = new javax.swing.JLabel();
        btnViajar = new javax.swing.JButton();
        lblViajar2 = new javax.swing.JLabel();
        btnFutbol = new javax.swing.JButton();
        lblFutbol2 = new javax.swing.JLabel();
        jpMedicamentos = new javax.swing.JPanel();
        btnPocion = new javax.swing.JButton();
        lblPocion2 = new javax.swing.JLabel();
        jpAlimentos = new javax.swing.JPanel();
        btnLava = new javax.swing.JButton();
        btnCarne = new javax.swing.JButton();
        btnManzana = new javax.swing.JButton();
        btnHuevo = new javax.swing.JButton();
        btnGalleta = new javax.swing.JButton();
        lblLava2 = new javax.swing.JLabel();
        lblGalleta2 = new javax.swing.JLabel();
        lblManzana2 = new javax.swing.JLabel();
        lblHuevo2 = new javax.swing.JLabel();
        lblCarne2 = new javax.swing.JLabel();
        lblSaludable = new javax.swing.JLabel();
        btnAlimentos = new javax.swing.JButton();
        lblEnfermo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        lblEnergia = new javax.swing.JLabel();
        lblNecesidades = new javax.swing.JLabel();
        lblHambre = new javax.swing.JLabel();
        lblAburrimiento = new javax.swing.JLabel();
        lblBebe = new javax.swing.JLabel();
        lblJoven = new javax.swing.JLabel();
        lblAdulto = new javax.swing.JLabel();
        lblNumAnnios = new javax.swing.JLabel();
        lblAnnios = new javax.swing.JLabel();
        jpbNecesidades = new javax.swing.JProgressBar();
        jpbHambre = new javax.swing.JProgressBar();
        jpbAburrimiento = new javax.swing.JProgressBar();
        btnMedicamentos = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblInformacionDe = new javax.swing.JLabel();
        jpbEnergia = new javax.swing.JProgressBar();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpActividades.setOpaque(false);
        jpActividades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBannio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBannio.setForeground(new java.awt.Color(255, 255, 255));
        btnBannio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baño32.png"))); // NOI18N
        btnBannio.setToolTipText("BAÑO [Quita las necesidades]");
        btnBannio.setContentAreaFilled(false);
        btnBannio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baño32.png"))); // NOI18N
        btnBannio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baño48.png"))); // NOI18N
        btnBannio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBannioActionPerformed(evt);
            }
        });
        jpActividades.add(btnBannio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 70, -1));

        lblBannio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblBannio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 60));

        btnNatacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNatacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNatacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/natacion32.png"))); // NOI18N
        btnNatacion.setToolTipText("NATACION [-40 Aburrimiento, -15 Energía]");
        btnNatacion.setContentAreaFilled(false);
        btnNatacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNatacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/natacion32.png"))); // NOI18N
        btnNatacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/natacion48.png"))); // NOI18N
        btnNatacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNatacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNatacionActionPerformed(evt);
            }
        });
        jpActividades.add(btnNatacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 270, 130, 110));

        lblNatacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblNatacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 50));

        btnDormir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDormir.setForeground(new java.awt.Color(255, 255, 255));
        btnDormir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dormir32.png"))); // NOI18N
        btnDormir.setToolTipText("DORMIR [+10 Aburrimiento, +40 Energía]");
        btnDormir.setContentAreaFilled(false);
        btnDormir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDormir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dormir32.png"))); // NOI18N
        btnDormir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dormir48.png"))); // NOI18N
        btnDormir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirActionPerformed(evt);
            }
        });
        jpActividades.add(btnDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 30, 150, 120));

        lblDormir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblDormir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 50));

        btnCaminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCaminar.setForeground(new java.awt.Color(255, 255, 255));
        btnCaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alas32.png"))); // NOI18N
        btnCaminar.setToolTipText("VOLAR [-10 Aburrimiento, -3 Energía]");
        btnCaminar.setContentAreaFilled(false);
        btnCaminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alas32.png"))); // NOI18N
        btnCaminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alas48.png"))); // NOI18N
        btnCaminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminarActionPerformed(evt);
            }
        });
        jpActividades.add(btnCaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 110, 110, 90));

        lblVolar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblVolar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 50));

        btnViajar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViajar.setForeground(new java.awt.Color(255, 255, 255));
        btnViajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viajar32.png"))); // NOI18N
        btnViajar.setToolTipText("VIAJAR [-50 Aburrimiento, -20 Energía]");
        btnViajar.setContentAreaFilled(false);
        btnViajar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViajar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viajar32.png"))); // NOI18N
        btnViajar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viajar48.png"))); // NOI18N
        btnViajar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajarActionPerformed(evt);
            }
        });
        jpActividades.add(btnViajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 210, 130, 110));

        lblViajar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblViajar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 40, 50));

        btnFutbol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFutbol.setForeground(new java.awt.Color(255, 255, 255));
        btnFutbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbo32.png"))); // NOI18N
        btnFutbol.setToolTipText("FUTBOL [-60 Aburrimiento, -30 Energía]");
        btnFutbol.setContentAreaFilled(false);
        btnFutbol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFutbol.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbo32.png"))); // NOI18N
        btnFutbol.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbo48.png"))); // NOI18N
        btnFutbol.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFutbolActionPerformed(evt);
            }
        });
        jpActividades.add(btnFutbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 170, 130, 90));

        lblFutbol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpActividades.add(lblFutbol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, 60));

        getContentPane().add(jpActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 60, 360));

        jpMedicamentos.setOpaque(false);
        jpMedicamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pocion32.png"))); // NOI18N
        btnPocion.setContentAreaFilled(false);
        btnPocion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pocion32.png"))); // NOI18N
        btnPocion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pocion48.png"))); // NOI18N
        btnPocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPocionActionPerformed(evt);
            }
        });
        jpMedicamentos.add(btnPocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 60));

        lblPocion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpMedicamentos.add(lblPocion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 70));

        getContentPane().add(jpMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, 80));

        jpAlimentos.setOpaque(false);
        jpAlimentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLava.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLava.setForeground(new java.awt.Color(255, 255, 255));
        btnLava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lava32.png"))); // NOI18N
        btnLava.setToolTipText("LAVA [Cura el hambre, +60 Energía]");
        btnLava.setContentAreaFilled(false);
        btnLava.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLava.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lava32.png"))); // NOI18N
        btnLava.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lava48.png"))); // NOI18N
        btnLava.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLavaActionPerformed(evt);
            }
        });
        jpAlimentos.add(btnLava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 70));

        btnCarne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCarne.setForeground(new java.awt.Color(255, 255, 255));
        btnCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne32.png"))); // NOI18N
        btnCarne.setToolTipText("CARNE [-50 Hambre, +15 Energía]");
        btnCarne.setContentAreaFilled(false);
        btnCarne.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarne.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne32.png"))); // NOI18N
        btnCarne.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne48.png"))); // NOI18N
        btnCarne.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarneActionPerformed(evt);
            }
        });
        jpAlimentos.add(btnCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 40));

        btnManzana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManzana.setForeground(new java.awt.Color(255, 255, 255));
        btnManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manzana32.png"))); // NOI18N
        btnManzana.setToolTipText("MANZANA [-5 Hambre, +1 Energía]");
        btnManzana.setContentAreaFilled(false);
        btnManzana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManzana.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manzana32.png"))); // NOI18N
        btnManzana.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manzana48.png"))); // NOI18N
        btnManzana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManzanaActionPerformed(evt);
            }
        });
        jpAlimentos.add(btnManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        btnHuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnHuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevoFrito32.png"))); // NOI18N
        btnHuevo.setToolTipText("HUEVO [-20 Hambre , +8 Energía]");
        btnHuevo.setContentAreaFilled(false);
        btnHuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevoFrito32.png"))); // NOI18N
        btnHuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevoFrito48.png"))); // NOI18N
        btnHuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuevoActionPerformed(evt);
            }
        });
        jpAlimentos.add(btnHuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 50));

        btnGalleta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGalleta.setForeground(new java.awt.Color(255, 255, 255));
        btnGalleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galleta32.png"))); // NOI18N
        btnGalleta.setToolTipText("GALLETA [-10 Hambre, +3 Energía]");
        btnGalleta.setContentAreaFilled(false);
        btnGalleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGalleta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galleta32.png"))); // NOI18N
        btnGalleta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galleta48.png"))); // NOI18N
        btnGalleta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGalleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGalletaActionPerformed(evt);
            }
        });
        jpAlimentos.add(btnGalleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 50));

        lblLava2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpAlimentos.add(lblLava2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 30));

        lblGalleta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpAlimentos.add(lblGalleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 30));

        lblManzana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpAlimentos.add(lblManzana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, 40));

        lblHuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpAlimentos.add(lblHuevo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 40, 40));

        lblCarne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equis32.png"))); // NOI18N
        jpAlimentos.add(lblCarne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 40));

        getContentPane().add(jpAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 330));

        lblSaludable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSaludable.setForeground(new java.awt.Color(0, 255, 0));
        lblSaludable.setText("Saludable");
        getContentPane().add(lblSaludable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));

        btnAlimentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alimentos64.png"))); // NOI18N
        btnAlimentos.setText("ALIMENTOS");
        btnAlimentos.setContentAreaFilled(false);
        btnAlimentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlimentos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAlimentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 110));

        lblEnfermo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnfermo.setForeground(new java.awt.Color(255, 51, 51));
        lblEnfermo.setText("Enfermo");
        getContentPane().add(lblEnfermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 20));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar48.png"))); // NOI18N
        btnCerrar.setText("Cerrar juego");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar48.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar58.png"))); // NOI18N
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 130, 100));

        btnActividades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actividades64.png"))); // NOI18N
        btnActividades.setText("ACTIVIDADES");
        btnActividades.setContentAreaFilled(false);
        btnActividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActividades.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actividades64.png"))); // NOI18N
        btnActividades.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actividades72.png"))); // NOI18N
        btnActividades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 140, 110));

        lblEnergia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnergia.setForeground(new java.awt.Color(255, 255, 255));
        lblEnergia.setText("Energía");
        getContentPane().add(lblEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        lblNecesidades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNecesidades.setForeground(new java.awt.Color(255, 255, 255));
        lblNecesidades.setText("Necesidades");
        getContentPane().add(lblNecesidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, -1, -1));

        lblHambre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHambre.setForeground(new java.awt.Color(255, 255, 255));
        lblHambre.setText("Hambre");
        getContentPane().add(lblHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        lblAburrimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAburrimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblAburrimiento.setText("Aburrimiento");
        getContentPane().add(lblAburrimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 580, 90, -1));

        lblBebe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charmander_3.gif"))); // NOI18N
        getContentPane().add(lblBebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, 260));

        lblJoven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charmaleon.gif"))); // NOI18N
        getContentPane().add(lblJoven, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 190, 260));

        lblAdulto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charizard_3.gif"))); // NOI18N
        getContentPane().add(lblAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 360, 450));

        lblNumAnnios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumAnnios.setForeground(new java.awt.Color(255, 255, 255));
        lblNumAnnios.setText("1");
        getContentPane().add(lblNumAnnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, 30));

        lblAnnios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAnnios.setForeground(new java.awt.Color(255, 255, 255));
        lblAnnios.setText("Años:");
        getContentPane().add(lblAnnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 30));

        jpbNecesidades.setBackground(new java.awt.Color(255, 255, 255));
        jpbNecesidades.setForeground(new java.awt.Color(0, 0, 0));
        jpbNecesidades.setBorderPainted(false);
        jpbNecesidades.setStringPainted(true);
        getContentPane().add(jpbNecesidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, 20));

        jpbHambre.setBackground(new java.awt.Color(255, 255, 255));
        jpbHambre.setForeground(new java.awt.Color(0, 0, 0));
        jpbHambre.setBorderPainted(false);
        jpbHambre.setStringPainted(true);
        getContentPane().add(jpbHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, 20));

        jpbAburrimiento.setBackground(new java.awt.Color(255, 255, 255));
        jpbAburrimiento.setForeground(new java.awt.Color(0, 0, 0));
        jpbAburrimiento.setBorderPainted(false);
        jpbAburrimiento.setString("0 %");
        jpbAburrimiento.setStringPainted(true);
        getContentPane().add(jpbAburrimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, 20));

        btnMedicamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botiquin64.png"))); // NOI18N
        btnMedicamentos.setText("MEDICAMENTOS");
        btnMedicamentos.setContentAreaFilled(false);
        btnMedicamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedicamentos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botiquin64.png"))); // NOI18N
        btnMedicamentos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botiquin72.png"))); // NOI18N
        btnMedicamentos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnMedicamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 160, 110));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 140, 40));

        lblInformacionDe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInformacionDe.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacionDe.setText("Información de");
        getContentPane().add(lblInformacionDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 200, 40));

        jpbEnergia.setStringPainted(true);
        getContentPane().add(jpbEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, 20));

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMascota2.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGalletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGalletaActionPerformed
        dragon.alimentar(galleta);
        this.mostrarHambre();
        this.mostarEnergia();
        FrmComiendo comiendo = new FrmComiendo();
        comiendo.setVisible(true);
        btnGalleta.setVisible(false);
        lblGalleta2.setVisible(true);
        galletaTiempo.start();
    }//GEN-LAST:event_btnGalletaActionPerformed

    private void btnHuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuevoActionPerformed
        dragon.alimentar(huevo);
        this.mostrarHambre();
        this.mostarEnergia();
        FrmComiendo comiendo = new FrmComiendo();
        comiendo.setVisible(true);
        btnHuevo.setVisible(false);
        lblHuevo2.setVisible(true);
        huevoTiempo.start();
    }//GEN-LAST:event_btnHuevoActionPerformed

    private void btnManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManzanaActionPerformed
        dragon.alimentar(manzana);
        this.mostrarHambre();
        this.mostarEnergia();
        FrmComiendo comiendo = new FrmComiendo();
        comiendo.setVisible(true);
        btnManzana.setVisible(false);
        lblManzana2.setVisible(true);
        manzanaTiempo.start();
    }//GEN-LAST:event_btnManzanaActionPerformed

    private void btnCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarneActionPerformed
        dragon.alimentar(carne);
        this.mostrarHambre();
        this.mostarEnergia();
        FrmComiendo comiendo = new FrmComiendo();
        comiendo.setVisible(true);
        btnCarne.setVisible(false);
        lblCarne2.setVisible(true);
        carneTiempo.start();
    }//GEN-LAST:event_btnCarneActionPerformed

    private void btnLavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLavaActionPerformed
        dragon.alimentar(lava);
        this.mostrarHambre();
        this.mostarEnergia();
        FrmComiendo comiendo = new FrmComiendo();
        comiendo.setVisible(true);
        btnLava.setVisible(false);
        lblLava2.setVisible(true);
        lavaTiempo.start();
    }//GEN-LAST:event_btnLavaActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        if (this.jpActividades.isVisible() == false) {
            this.jpActividades.setVisible(true);
            btnCerrar.setVisible(false);
        } else {
            this.jpActividades.setVisible(false);
            btnCerrar.setVisible(true);
        }
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFutbolActionPerformed
        dragon.realizarActividad(futbol);
        this.mostarEnergia();
        this.mostrarAburrimiento();
        FrmAnimActividad actividad = new FrmAnimActividad();
        actividad.setVisible(true);
        btnFutbol.setVisible(false);
        lblFutbol2.setVisible(true);
        futbolTiempo.start();
    }//GEN-LAST:event_btnFutbolActionPerformed

    private void btnViajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajarActionPerformed
        dragon.realizarActividad(viajar);
        this.mostarEnergia();
        this.mostrarAburrimiento();
        FrmAnimActividad actividad = new FrmAnimActividad();
        actividad.setVisible(true);
        btnViajar.setVisible(false);
        lblViajar2.setVisible(true);
        viajarTiempo.start();
    }//GEN-LAST:event_btnViajarActionPerformed

    private void btnCaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminarActionPerformed
        dragon.realizarActividad(volar);
        this.mostarEnergia();
        this.mostrarAburrimiento();
        FrmAnimActividad actividad = new FrmAnimActividad();
        actividad.setVisible(true);
        btnCaminar.setVisible(false);
        lblVolar2.setVisible(true);
        volarTiempo.start();
    }//GEN-LAST:event_btnCaminarActionPerformed

    private void btnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirActionPerformed
        dragon.realizarActividad(dormir);
        this.mostarEnergia();
        this.mostrarAburrimiento();
        FrmAnimDurmiendo durmiendo = new FrmAnimDurmiendo();
        durmiendo.setVisible(true);
        btnBannio.setVisible(false);
        lblBannio2.setVisible(true);
        bannioTiempo.start();
    }//GEN-LAST:event_btnDormirActionPerformed

    private void btnNatacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNatacionActionPerformed
        dragon.realizarActividad(natacion);
        this.mostarEnergia();
        this.mostrarAburrimiento();
        FrmAnimActividad actividad = new FrmAnimActividad();
        actividad.setVisible(true);
        btnNatacion.setVisible(false);
        lblNatacion2.setVisible(true);
        natacionTiempo.start();
    }//GEN-LAST:event_btnNatacionActionPerformed

    private void btnBannioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBannioActionPerformed
        dragon.setNecesidades(dragon.getNecesidades() - bannio.bajarNecesidades);
        FrmAnimCensura censura = new FrmAnimCensura();
        censura.setVisible(true);
        this.mostrarNecesidades();
        btnBannio.setVisible(false);
        lblBannio2.setVisible(true);
        bannioTiempo.start();

//        btnManzana.setVisible(false);
//        lblManzana2.setVisible(true);
//        manzanaTiempo.start();
    }//GEN-LAST:event_btnBannioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnPocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPocionActionPerformed
        if (dragon.getAburrimiento() >= 90) {
            dragon.setAburrimiento(dragon.getAburrimiento() - 20);
        }
        if (dragon.getEnergia() <= 10) {
            dragon.setEnergia(dragon.getEnergia() + 20);
        }
        if (dragon.getHambre() >= 90) {
            dragon.setHambre(dragon.getHambre() - 20);
        }
        if (dragon.getNecesidades() >= 90) {
            dragon.setNecesidades(dragon.getNecesidades() - 20);
        }
        this.mostrarAburrimiento();
        this.mostrarHambre();
        this.mostarEnergia();
        this.mostrarNecesidades();
        FrmCurandose curandose = new FrmCurandose();
        curandose.setVisible(true);
        btnPocion.setVisible(false);
        lblPocion2.setVisible(true);
        pocionTiempo.start();
    }//GEN-LAST:event_btnPocionActionPerformed

    private void btnAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentosActionPerformed
        if (this.jpAlimentos.isVisible() == false) {
            this.jpAlimentos.setVisible(true);
            btnMedicamentos.setVisible(false);
        } else {
            this.jpAlimentos.setVisible(false);
            jpMedicamentos.setVisible(false);
            btnMedicamentos.setVisible(true);
        }

    }//GEN-LAST:event_btnAlimentosActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        if (this.jpMedicamentos.isVisible() == false) {
            this.jpMedicamentos.setVisible(true);
        } else {
            this.jpMedicamentos.setVisible(false);
            btnMedicamentos.setVisible(true);
        }
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnAlimentos;
    private javax.swing.JButton btnBannio;
    private javax.swing.JButton btnCaminar;
    private javax.swing.JButton btnCarne;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDormir;
    private javax.swing.JButton btnFutbol;
    private javax.swing.JButton btnGalleta;
    private javax.swing.JButton btnHuevo;
    private javax.swing.JButton btnLava;
    private javax.swing.JButton btnManzana;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnNatacion;
    private javax.swing.JButton btnPocion;
    private javax.swing.JButton btnViajar;
    private javax.swing.JPanel jpActividades;
    private javax.swing.JPanel jpAlimentos;
    private javax.swing.JPanel jpMedicamentos;
    private javax.swing.JProgressBar jpbAburrimiento;
    private javax.swing.JProgressBar jpbEnergia;
    private javax.swing.JProgressBar jpbHambre;
    private javax.swing.JProgressBar jpbNecesidades;
    private javax.swing.JLabel lblAburrimiento;
    private javax.swing.JLabel lblAdulto;
    private javax.swing.JLabel lblAnnios;
    private javax.swing.JLabel lblBannio2;
    private javax.swing.JLabel lblBebe;
    private javax.swing.JLabel lblCarne2;
    private javax.swing.JLabel lblDormir2;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblEnfermo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFutbol2;
    private javax.swing.JLabel lblGalleta2;
    private javax.swing.JLabel lblHambre;
    private javax.swing.JLabel lblHuevo2;
    private javax.swing.JLabel lblInformacionDe;
    private javax.swing.JLabel lblJoven;
    private javax.swing.JLabel lblLava2;
    private javax.swing.JLabel lblManzana2;
    private javax.swing.JLabel lblNatacion2;
    private javax.swing.JLabel lblNecesidades;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumAnnios;
    private javax.swing.JLabel lblPocion2;
    private javax.swing.JLabel lblSaludable;
    private javax.swing.JLabel lblViajar2;
    private javax.swing.JLabel lblVolar2;
    // End of variables declaration//GEN-END:variables
}
