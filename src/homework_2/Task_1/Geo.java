package homework_2.Task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geo<COORDINATE> {
    private COORDINATE lat;
    private COORDINATE lng;
}
