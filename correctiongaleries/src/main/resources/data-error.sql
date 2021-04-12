-- Les données qui seront initialisées automatiquement quand on lance l'application
-- cf. application.properties
INSERT INTO Compte(DTYPE,id, nom, prenom, adresse, ville, numtel, email,mdp) VALUES 
    ('Medecin','WassLaMenace', 'Aityoucef', 'Wassim','24 rue de la Tolosane','81100 Castres','0782350075','wass.aityoucef@gmail.com','wasslamenace'),
    ('Medecin','RemiBastide', 'Bastide', 'Remi','2 rue de la Paix','81000 Albi','0606060606','remibastide@gmail.com','remibastide'),
    ('Patient','narcolin', 'Gay', 'Colin','11 place de la République','81100 Castres','0783734322','colin.gay25@gmail.com','jesuiscolin'),
    ('Patient','flotov', 'Thauvin', 'Florian','51 rue du Pastis','13000 Marseille','0613131313','allezlom@bouillabaisse.com','velodrome13pastis'),
    ('Patient','pbernardoni', 'Bernardoni', 'Paul','17 avenue De Gaulle','75000 Paris','0610203040','pbernardoni@gmail.com','pauldu75leboss'),
    ('Patient','antoinevidal', 'Vidal', 'Antoine','2 rue Beaujeu','81100 Castres','0622334455','antovidal@gmail.com','leroymerlin');

INSERT INTO Patient(DTYPE,numSecu) VALUES
    ('101026912312312'),
    ('193011348648755'),
    ('198077578943488'),
    ('187068186734057');

INSERT INTO Médecin(numPPS, specialite,diplome) VALUES
    ('15448','Psychologie',TRUE),
    ('45645','Psychothérapie', TRUE),

INSERT INTO Bracelet(numSerie, freqcard, coordGPS) VALUES
    ('DBZ831235','120','39° 17′ N, 76° 36′ O'),
    ('SNK943534','120','41° 22′ N, 70° 11′ O'),
    ('JJK545307','120','30° 31′ N, 79° 33′ O'),
    ('MHA815615','120','37° 26′ N, 69° 19′ O');
