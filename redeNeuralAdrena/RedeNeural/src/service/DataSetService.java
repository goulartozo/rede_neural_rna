package service;

import ADReNA_API.Data.DataSet;
import ADReNA_API.Data.DataSetObject;
import model.Paciente;
import util.ConversorPaciente;

import java.util.List;

public class DataSetService {

    public DataSet gerarDataSet(List<Paciente> pacientes) throws Exception {

        DataSet dataSet = new DataSet(13, 3);

        ConversorPaciente conversor =
                new ConversorPaciente();

        for (Paciente paciente : pacientes) {

            DataSetObject objeto =
                    conversor.converter(paciente);

            dataSet.Add(objeto);
        }

        return dataSet;
    }
}