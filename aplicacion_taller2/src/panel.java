


import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author rex
 */
public class panel extends javax.swing.JFrame {

    /**
     * Creates new form panel
     */
    public panel() {
        initComponents();
        
        setSize(700, 500);
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(this);
        this.listauno.setVisible(false);         //para banda uno
        this.listados.setVisible(false);         //para banda dos
        this.listatres.setVisible(false);        //para banda tres
        
        this.multiplica.setVisible(false);     //del selector de color
        this.tolerencias.setVisible(false);    //del selector de color
        
        this.coloruno.setVisible(false);       // color de la banda uno
        this.colordos.setVisible(false);        // color de la banda dos
        this.colortres.setVisible(false);       // color de la banda tres
        
        this.multiplicador.setVisible(false);   //del dibujo de la resistencia
        this.tolerancia.setVisible(false);      //del dibujo de la resistencia
        
        total_resis(Integer.parseInt(bandas.getSelectedItem().toString()));
        
        listauno.setBackground(oro());
        listados.setBackground(oro());
        listatres.setBackground(oro());
        multiplica.setBackground(oro());
        tolerencias.setBackground(oro());

        paneluno.setBackground(Color.CYAN);
        paneldos.setBackground(Color.CYAN);
        
        salir.setBackground(Color.RED);
        bandas.setBackground(Color.green);
        reset.setBackground(oro());
    }
     public Color cafe() {
        Color cafe = new Color(102, 51, 0);
        return cafe;
    }
       public Color violeta() {
        Color violeta = new Color(204, 0, 204);

        return violeta;
    }

    public Color oro() {
        Color oro = new Color(172, 150, 0);
        return oro;
    }

    public Color plata() {
        Color plata = new Color(153, 153, 153);
        return plata;
    }

    public Color reset_color() {
        Color reset = new Color(187, 187, 187);
        return reset;
    }

     public int Select1() {
        int opcion = listauno.getSelectedIndex();
        switch (opcion) {
            case 0:
                coloruno.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                coloruno.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                coloruno.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                coloruno.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                coloruno.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                coloruno.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                coloruno.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                coloruno.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                coloruno.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                coloruno.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                coloruno.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }
      public int Select2() {
        int opcion = listados.getSelectedIndex();
        switch (opcion) {
            case 0:
                colordos.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                colordos.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                colordos.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                colordos.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                colordos.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                colordos.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                colordos.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                colordos.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                colordos.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                colordos.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                colordos.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }
      public float calc() {
        
        
        float banda1 = 0;
        if ((Integer.parseInt(bandas.getSelectedItem().toString())) == 4) {
            banda1 = ((Select1() * 10) + Select2()) * Select4();
        } else {
            banda1 = ((Select1() * 100) + (Select2() * 10) + Select3()) * Select4();
        }

        if (tolerencias.getSelectedItem().toString() =="Ninguno") {
            tole.setText("+/- 20%");
            tolerancia.setVisible(false);
        }
        
        return banda1;
    }
      
       public int Select3() {
        int opcion = listatres.getSelectedIndex();
        switch (opcion) {
            case 0:
                colortres.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                colortres.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                colortres.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                colortres.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                colortres.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                colortres.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                colortres.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                colortres.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                colortres.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                colortres.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                colortres.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }
public float Select4() {
        int o = multiplica.getSelectedIndex();
        float opcion = 0;

        switch (o) {
            case 0:
                multiplicador.setBackground(reset_color());
                break;
            case 1:
                opcion = 1;
                multiplicador.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 10;
                multiplicador.setBackground(cafe());
                break;
            case 3:
                opcion = 100;
                multiplicador.setBackground(Color.RED);
                break;
            case 4:
                opcion = 1000;
                multiplicador.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 10000;
                multiplicador.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 100000;
                multiplicador.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 1000000;
                multiplicador.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = (float) 0.01;
                multiplicador.setBackground(plata());
                break;
            case 9:
                opcion = (float) 0.1;
                multiplicador.setBackground(oro());
                break;

            default:

                break;
        }

        return opcion;
    }
public void Select5() {
        int opcion = tolerencias.getSelectedIndex();
        switch (opcion) {
            case 0:
                tolerancia.setBackground(reset_color());
                tolerancia.setVisible(false);
                tole.setText("+/- 20%");
                break;
            case 1:

                tolerancia.setBackground(cafe());
                tolerancia.setVisible(true);
                tole.setText("+/- 1%");
                break;
            case 2:

                tolerancia.setBackground(Color.RED);
                tolerancia.setVisible(true);
                tole.setText("+/- 2%");
                break;
            case 3:

                tolerancia.setBackground(Color.GREEN);
                tolerancia.setVisible(true);
                tole.setText("+/- 0.5%");
                break;
            case 4:

                tolerancia.setBackground(Color.BLUE);
                tolerancia.setVisible(true);
                tole.setText("+/- 0.25%");
                break;
            case 5:

                tolerancia.setBackground(violeta());
                tolerancia.setVisible(true);
                tole.setText("+/- 0.10%");
                break;
            case 6:

                tolerancia.setBackground(Color.GRAY);
                tolerancia.setVisible(true);
                tole.setText("+/- 0.05%");
                break;
            case 7:

                tolerancia.setBackground(oro());
                tolerancia.setVisible(true);
                tole.setText("+/- 5%");
                break;
            case 8:

                tolerancia.setBackground(plata());
                tolerancia.setVisible(true);
                tole.setText("+/- 10%");
                break;

            default:

                break;
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneluno = new javax.swing.JPanel();
        listauno = new javax.swing.JComboBox<>();
        listados = new javax.swing.JComboBox<>();
        listatres = new javax.swing.JComboBox<>();
        multiplica = new javax.swing.JComboBox<>();
        tolerencias = new javax.swing.JComboBox<>();
        paneldos = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        unidades = new javax.swing.JComboBox<>();
        tole = new javax.swing.JLabel();
        coloruno = new javax.swing.JButton();
        colortres = new javax.swing.JButton();
        colordos = new javax.swing.JButton();
        multiplicador = new javax.swing.JButton();
        tolerancia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bandas = new javax.swing.JComboBox<>();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de resistencias");
        setBackground(new java.awt.Color(51, 51, 51));

        paneluno.setBackground(new java.awt.Color(204, 0, 51));
        paneluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listauno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listauno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaunoActionPerformed(evt);
            }
        });

        listados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadosActionPerformed(evt);
            }
        });

        listatres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listatres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listatresActionPerformed(evt);
            }
        });

        multiplica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaActionPerformed(evt);
            }
        });

        tolerencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tolerencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolerenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelunoLayout = new javax.swing.GroupLayout(paneluno);
        paneluno.setLayout(panelunoLayout);
        panelunoLayout.setHorizontalGroup(
            panelunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelunoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(listauno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(listados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(listatres, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(multiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(tolerencias, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelunoLayout.setVerticalGroup(
            panelunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelunoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listauno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listatres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tolerencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        paneldos.setBackground(new java.awt.Color(204, 204, 204));
        paneldos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        resultado.setBackground(new java.awt.Color(153, 153, 153));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        unidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout paneldosLayout = new javax.swing.GroupLayout(paneldos);
        paneldos.setLayout(paneldosLayout);
        paneldosLayout.setHorizontalGroup(
            paneldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tole, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        paneldosLayout.setVerticalGroup(
            paneldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldosLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        coloruno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorunoActionPerformed(evt);
            }
        });

        jLabel1.setText("seleccione color");

        jLabel2.setText("lectura");

        reset.setText("resetear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel3.setText("seleccione # bandas");

        bandas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandasActionPerformed(evt);
            }
        });

        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(95, 95, 95)
                        .addComponent(coloruno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(colordos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(colortres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(multiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bandas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bandas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(paneldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(coloruno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colordos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colortres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(tolerancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(63, 63, 63))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(multiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paneluno.getAccessibleContext().setAccessibleName("seleccione color");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorunoActionPerformed

    private void listatresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listatresActionPerformed
        resultado.setText("" + calc());   //muestra en vacio o datos de la lista tres de seleecion de color
    }//GEN-LAST:event_listatresActionPerformed

    private void listaunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaunoActionPerformed
      resultado.setText("" + calc());   //muestra en vacio o datos de la lista uno de seleecion de color
    }//GEN-LAST:event_listaunoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);  //sale de la app
    }//GEN-LAST:event_salirActionPerformed

    private void listadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadosActionPerformed
        resultado.setText("" + calc());   //muestra en vacio o datos de la lista dos de seleecion de color
    }//GEN-LAST:event_listadosActionPerformed

    private void multiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaActionPerformed
        resultado.setText("" + calc());  //muestra en vacio o datos del  multiplicador de colores
    }//GEN-LAST:event_multiplicaActionPerformed

    private void tolerenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolerenciasActionPerformed
        Select5();   //muestra el contenido de la seleccion 5
    }//GEN-LAST:event_tolerenciasActionPerformed

    private void bandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandasActionPerformed

            
            
        
    }//GEN-LAST:event_bandasActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
           listauno.setSelectedItem("Ninguno");
           listados.setSelectedItem("Ninguno");
           listatres.setSelectedItem("Ninguno");
           multiplica.setSelectedItem("Ninguno");
           tolerencias.setSelectedItem("Ninguno");
       
        tole.setText("");
        resultado.setText("");
        coloruno.setBackground(reset_color());
        colordos.setBackground(reset_color());
        colortres.setBackground(reset_color());
        multiplicador.setBackground(reset_color());
        tolerancia.setBackground(reset_color());
    }//GEN-LAST:event_resetActionPerformed
        
    public void total_resis(int total){
    
    if (total == 4) {
            listauno.setVisible(true);
            multiplica.setVisible(true);
            tolerencias.setVisible(true);
            listatres.setVisible(false);
            colortres.setVisible(false);

            listados.setVisible(true);
            coloruno.setVisible(true);
            colordos.setVisible(true);
            multiplicador.setVisible(true);
            tolerancia.setVisible(true);

            // tolerancia(total);
        }
        if (total == 5) {
            listauno.setVisible(true);
            multiplica.setVisible(true);
            tolerencias.setVisible(true);
            listados.setVisible(true);
            listatres.setVisible(true);
            colortres.setVisible(true);

        }

    }
    
    
    public float convertidor() {
        int or = unidades.getSelectedIndex();
        float val = 0;
        switch (or) {
            case 0:
                val = calc();
                break;
            case 1:
                val = (float) (calc() * 0.001);
                break;
            case 2:
                val = (float) (calc() * 0.000001);
                break;
            case 3:
                val = (float) (calc() * 0.000000001);
                break;
            case 4:
                val = (float) (calc() * 1000);
                break;
            case 5:
                val = (float) (calc() * 1000000);
                break;
            case 6:
                val = (float) (calc() * 1000000000);
                break;
        }
        return val;
    }
    
    
     public void divide_ca(String cadena) {
        int r = (int) (Double.parseDouble(cadena)); //convierte a entero la cadena
        String copia = String.valueOf(r); //convierte String del entero convertido

        int resultado = 0;
        //String color3 = "negro";
        if (copia.length() == 1) {
            resultado = r;
            //here
            multiplica.setSelectedItem("Negro");
            multiplicador.setBackground(Color.BLACK);
          //selecciona los colores en lo cual multipca por cantidad de ceros
        } else {
            if (copia.length() == 2) {
                resultado = r;
                multiplicador.setBackground(Color.BLACK);
                //here
                multiplica.setSelectedItem("Negro");
            } else if (copia.length() == 3) {
                resultado = r / 10;
                multiplicador.setBackground(cafe());
                multiplica.setSelectedItem("Cafe");

            } else if (copia.length() == 4) {
                resultado = r / 100;
                multiplicador.setBackground(Color.RED);
                multiplica.setSelectedItem("Rojo");
            } else if (copia.length() == 5) {
                resultado = r / 1000;
                multiplicador.setBackground(Color.ORANGE);
                multiplica.setSelectedItem("Naranja");
            } else if (copia.length() == 6) {
                resultado = r / 10000;
                multiplicador.setBackground(Color.YELLOW);
                multiplica.setSelectedItem("Amarillo");
            } else if (copia.length() == 7) {
                resultado = r / 100000;
                multiplicador.setBackground(Color.GREEN);
                multiplica.setSelectedItem("Verde");
            } else if (copia.length() == 8) {
                resultado = r / 100000;
                multiplicador.setBackground(Color.BLUE);
                multiplica.setSelectedItem("Azul");
            } else if (copia.length() == 9) {
                resultado = r / 10000000;
                multiplicador.setBackground(violeta());
                multiplica.setSelectedItem("Violeta");
            }
        }
     //System.out.println("resul: " + resultado);
        String copi = String.valueOf(resultado);
        int[] enteros = new int[copi.length()];

        String cad = "";

        for (int j = 0; j < copi.length(); j++) {
            cad = String.valueOf(copi.charAt(j));

            enteros[j] = Integer.parseInt(cad);
            
            }
         //asigna los colores con los numeros de la segunda lista
        if (enteros.length < 2) {
            if (enteros[0] == 0) {
                colordos.setBackground(Color.BLACK);
                //here
                listados.setSelectedItem("Negro");
            } else if (enteros[0] == 1) {
                colordos.setBackground(cafe());
                listados.setSelectedItem("Cafe");
            } else if (enteros[0] == 2) {
                colordos.setBackground(Color.RED);
                listados.setSelectedItem("Rojo");
            } else if (enteros[0] == 3) {
                colordos.setBackground(Color.ORANGE);
                listados.setSelectedItem("Naranja");
            } else if (enteros[0] == 4) {
                colordos.setBackground(Color.YELLOW);
                listados.setSelectedItem("Amarillo");
            } else if (enteros[0] == 5) {
                colordos.setBackground(Color.GREEN);
                listados.setSelectedItem("Verde");
            } else if (enteros[0] == 6) {
                colordos.setBackground(Color.BLUE);
                listados.setSelectedItem("Azul");
            } else if (enteros[0] == 7) {
                colordos.setBackground(violeta());
                listados.setSelectedItem("Violeta");
            } else if (enteros[0] == 8) {
                colordos.setBackground(Color.GRAY);
                listados.setSelectedItem("Gris");
            } else if (enteros[0] == 9) {
                colordos.setBackground(Color.WHITE);
                listados.setSelectedItem("Blanco");
            }
            
            //System.out.println(color2 + "  " + color + "  " + color3);
        } else {
             //asigna los colores con los numeros de la primera lista
            if (enteros[0] == 0) {
                coloruno.setBackground(Color.BLACK);
                //here
                listauno.setSelectedItem("Negro");
            } else if (enteros[0] == 1) {
                listauno.setSelectedItem("Cafe");
                coloruno.setBackground(cafe());
            } else if (enteros[0] == 2) {
                coloruno.setBackground(Color.RED);
                listauno.setSelectedItem("Rojo");
            } else if (enteros[0] == 3) {
                coloruno.setBackground(Color.ORANGE);
                listauno.setSelectedItem("Naranja");
            } else if (enteros[0] == 4) {
                coloruno.setBackground(Color.YELLOW);
                listauno.setSelectedItem("Amarillo");
            } else if (enteros[0] == 5) {
                coloruno.setBackground(Color.GREEN);
                listauno.setSelectedItem("Verde");
            } else if (enteros[0] == 6) {
                coloruno.setBackground(Color.BLUE);
                listauno.setSelectedItem("Azul");
            } else if (enteros[0] == 7) {
                coloruno.setBackground(violeta());
                listauno.setSelectedItem("Violeta");
            } else if (enteros[0] == 8) {
                coloruno.setBackground(Color.GRAY);
                listauno.setSelectedItem("Gris");
            } else if (enteros[0] == 9) {
                coloruno.setBackground(Color.WHITE);
                listauno.setSelectedItem("Blanco");
            }
            
            if (enteros[1] == 0) {
                colordos.setBackground(Color.BLACK);
                //here
                listados.setSelectedItem("Negro");
            } else if (enteros[1] == 1) {
                colordos.setBackground(cafe());
                listados.setSelectedItem("Cafe");
            } else if (enteros[1] == 2) {
                colordos.setBackground(Color.RED);
                listados.setSelectedItem("Rojo");
            } else if (enteros[1] == 3) {
                colordos.setBackground(Color.ORANGE);
                listados.setSelectedItem("Naranja");
            } else if (enteros[1] == 4) {
                colordos.setBackground(Color.YELLOW);
                listados.setSelectedItem("Amarillo");
            } else if (enteros[1] == 5) {
                colordos.setBackground(Color.GREEN);
                listados.setSelectedItem("Verde");
            } else if (enteros[1] == 6) {
                colordos.setBackground(Color.BLUE);
                listados.setSelectedItem("Azul");
            } else if (enteros[1] == 7) {
                colordos.setBackground(violeta());
                listados.setSelectedItem("Violeta");
            } else if (enteros[1] == 8) {
                colordos.setBackground(Color.GRAY);
                listados.setSelectedItem("Gris");
            } else if (enteros[1] == 9) {
                colordos.setBackground(Color.WHITE);
                listados.setSelectedItem("Blanco");
            }
            //System.out.println(color + "  " + color2 + "  " + color3);
        }
    }
     
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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bandas;
    private javax.swing.JButton colordos;
    private javax.swing.JButton colortres;
    private javax.swing.JButton coloruno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listados;
    private javax.swing.JComboBox<String> listatres;
    private javax.swing.JComboBox<String> listauno;
    private javax.swing.JComboBox<String> multiplica;
    private javax.swing.JButton multiplicador;
    private javax.swing.JPanel paneldos;
    private javax.swing.JPanel paneluno;
    private javax.swing.JButton reset;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tole;
    private javax.swing.JButton tolerancia;
    private javax.swing.JComboBox<String> tolerencias;
    private javax.swing.JComboBox<String> unidades;
    // End of variables declaration//GEN-END:variables
}
