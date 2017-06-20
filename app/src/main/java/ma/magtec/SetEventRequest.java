package ma.magtec;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SetEventRequest extends StringRequest {
    //private static final String REGISTER_REQUEST_URL = "http://10.58.28.230/Register.php";
    private static final String REGISTER_REQUEST_URL = "https://bqqbz.000webhostapp.com/magTec/SetEvent.php";
    //private static final String REGISTER_REQUEST_URL = "http://192.168.10.82/Register.php";
    private Map<String, String> params;

    public SetEventRequest(String eventname, String eventdescription, String date, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("eventname", eventname);
        params.put("eventdescription", eventdescription);
        params.put("date", date);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
