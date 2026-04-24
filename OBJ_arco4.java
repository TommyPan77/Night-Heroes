<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
    <Property name="title" type="java.lang.String" value="Night Heroes"/>
    <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
      <Color blue="0" green="0" red="0" type="rgb"/>
    </Property>
    <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
      <Color id="Cursor Por defecto"/>
    </Property>
    <Property name="resizable" type="boolean" value="false"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="3"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="274" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Component id="jLabel1" min="-2" pref="119" max="-2" attributes="0"/>
                  <Component id="jLabel2" min="-2" pref="119" max="-2" attributes="0"/>
                  <Component id="jLabel3" min="-2" pref="119" max="-2" attributes="0"/>
              </Group>
              <EmptySpace min="-2" pref="63" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" max="-2" attributes="0">
                  <Component id="btnTanque" max="32767" attributes="0"/>
                  <Component id="btnArquero" alignment="0" max="32767" attributes="0"/>
                  <Component id="btnCaballero" alignment="0" pref="128" max="32767" attributes="0"/>
              </Group>
              <EmptySpace pref="376" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="148" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="btnTanque" alignment="3" min="-2" pref="55" max="-2" attributes="0"/>
                  <Component id="jLabel1" alignment="3" min="-2" pref="40" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="btnArquero" alignment="3" min="-2" pref="55" max="-2" attributes="0"/>
                  <Component id="jLabel3" alignment="3" min="-2" pref="40" max="-2" attributes="0"/>
              </Group>
              <EmptySpace min="-2" pref="31" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jLabel2" min="-2" pref="40" max="-2" attributes="0"/>
                  <Component id="btnCaballero" min="-2" pref="55" max="-2" attributes="0"/>
              </Group>
              <EmptySpace pref="214" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JButton" name="btnTanque">
      <Properties>
        <Property name="text" type="java.lang.String" value="Tanque"/>
        <Property name="borderPainted" type="boolean" value="false"/>
        <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
          <Color id="Cursor de Mano"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnTanqueActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnArquero">
      <Properties>
        <Property name="text" type="java.lang.String" value="Arquero"/>
        <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
          <Color id="Cursor de Mano"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnArqueroActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnCaballero">
      <Properties>
        <Property name="text" type="java.lang.String" value="Caballero"/>
        <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
          <Color id="Cursor de Mano"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnCaballeroActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="ff" red="ff" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Imagen Tanque"/>
        <Property name="maximumSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
          <Dimension value="[16, 16]"/>
        </Property>
        <Property name="minimumSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
          <Dimension value="[16, 16]"/>
        </Property>
        <Property name="preferredSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
          <Dimension value="[16, 16]"/>
        </Property>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="ff" red="ff" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Imagen Caballero"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel3">
      <Properties>
        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
          <Color blue="ff" green="ff" red="ff" type="rgb"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Imagen Arquero"/>
      </Properties>
    </Component>
  </SubComponents>
</Form>
