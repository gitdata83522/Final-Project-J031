import { Link, useNavigate } from 'react-router-dom';
import Navbar from '../components/navbar';
import { useState } from 'react';
import Amenity from '../components/amenity'
import { toast } from 'react-toastify';
import { addMobile } from '../services/properties';

function AddMobile() {
  const [brand, setBrand] = useState('');
  const [model, setModel] = useState('');
  const [price, setPrice] = useState('');
  const [processor, setProcessor] = useState('');
  const [ram, setRam] = useState('');
  const [storage, setStorage] = useState('');
  const [battery, setBattery] = useState('');
  const [camera, setCamera] = useState('');

  const [is5G, setIs5G] = useState(false);
  const [isWaterResistant, setIsWaterResistant] = useState(false);
  const [isFingerprintSensor, setIsFingerprintSensor] = useState(false);
  const [isFaceRecognition, setIsFaceRecognition] = useState(false);

  const [image, setImage] = useState(undefined);

  const navigate = useNavigate();

  const onSave = async () => {
    if (brand.length === 0) {
      toast.warn('Please enter brand');
    } else if (model.length === 0) {
      toast.warn('Please enter model');
    } else if (price.length === 0) {
      toast.warn('Please enter price');
    } else if (!image) {
      toast.warn('Please select a mobile photo');
    } else {
      const result = await addMobile(
        brand,
        model,
        price,
        processor,
        ram,
        storage,
        battery,
        camera,
        is5G,
        isWaterResistant,
        isFingerprintSensor,
        isFaceRecognition,
        image
      );
      if (result.status === 'success') {
        toast.success('Successfully added a mobile');
        navigate('/mobiles');
      } else {
        toast.error(result.error);
      }
    }
  };

  return (
    <div>
      <Navbar />
      <h2 className="page-header">Add Mobile</h2>
      <div className="form">
        <div className="row">
          <div className="col-2">
            <div className="mb-3">
              <label htmlFor="">Brand</label>
              <input
                onChange={(e) => setBrand(e.target.value)}
                type="text"
                className="form-control"
              />
            </div>
          </div>
          <div className="col">
            <div className="mb-3">
              <label htmlFor="">Model</label>
              <input
                onChange={(e) => setModel(e.target.value)}
                type="text"
                className="form-control"
              />
            </div>
          </div>
          <div className="col">
            <div className="mb-3">
              <label htmlFor="">Price</label>
              <input
                onChange={(e) => setPrice(e.target.value)}
                type="text"
                className="form-control"
              />
            </div>
          </div>
        </div>

        <div className="row mb-3">
          <div className="col">
            <label htmlFor="">Processor</label>
            <input
              onChange={(e) => setProcessor(e.target.value)}
              type="text"
              className="form-control"
            />
          </div>
          <div className="col">
            <label htmlFor="">RAM</label>
            <input
              onChange={(e) => setRam(e.target.value)}
              type="text"
              className="form-control"
            />
          </div>
          <div className="col">
            <label htmlFor="">Storage</label>
            <input
              onChange={(e) => setStorage(e.target.value)}
              type="text"
              className="form-control"
            />
          </div>
        </div>

        <div className="row mb-3">
          <div className="col">
            <label htmlFor="">Battery</label>
            <input
              onChange={(e) => setBattery(e.target.value)}
              type="text"
              className="form-control"
            />
          </div>
          <div className="col">
            <label htmlFor="">Camera</label>
            <input
              onChange={(e) => setCamera(e.target.value)}
              type="text"
              className="form-control"
            />
          </div>
        </div>

        <h3>Amenities </h3>
        <div className="row mb-3">
          <div className="row">
            <div className="col">
                <Amenity
                onChange={(status) => setIs5G(status)}
                  title='Is 5G'
                />
                <label className="form-check-label">5G</label>
              </div>
              <div className="form-check">
                <Amenity
                  className="form-check-input"
                  type="checkbox"
                  checked={isWaterResistant}
                  onChange={(e) => setIsWaterResistant(e.target.checked)}
                />
                <label className="form-check-label">Water Resistant</label>
              </div>
              <div className="form-check">
                <Amenity
                  className="form-check-input"
                  type="checkbox"
                  checked={isFingerprintSensor}
                  onChange={(e) => setIsFingerprintSensor(e.target.checked)}
                />
                <label className="form-check-label">Fingerprint Sensor</label>
              </div>
              <div className="form-check">
                <input
                  className="form-check-input"
                  type="checkbox"
                  checked={isFaceRecognition}
                  onChange={(e) => setIsFaceRecognition(e.target.checked)}
                />
                <label className="form-check-label">Face Recognition</label>
              </div>
            </div>
          </div>
        </div>

        <div className="mb-3">
          <label htmlFor="">Image</label>
          <input
            accept="image/*"
            onChange={(e) => setImage(e.target.files[0])}
            type="file"
            className="form-control"
          />
        </div>

        <div className="mb-3">
          <button onClick={onSave} className="btn btn-success me-2">
            Save
          </button>
          <Link to="/mobiles" className="btn btn-danger">
            Cancel
          </Link>
        </div>
      </div>
    
  );
}

export default AddMobile;
